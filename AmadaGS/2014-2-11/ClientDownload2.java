package com.eoe.se2.day07.download;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.eoe.se2.day06.socket04.FileInfo;

public class ClientDownload2 {

	static final String DEST_PATH="D:/JAVA_Test/dest/";
	static final String FILENAME="eclipse-SDK-3.5.2-win32.zip";
	static final String RECORD_FILENAME="eclipse-SDK-RECORD.dat";
	static boolean isContinue=true;
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				System.out.println("按任意鍵停止下載");
				new Scanner(System.in).next();
				isContinue=false;
			};
		}.start();
		RandomAccessFile  raf=null;
		ObjectOutputStream oos=null;
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1",9988);
			oos=new ObjectOutputStream(socket.getOutputStream());
			//读取断点位置
			long position=readPosition();
			
			FileInfo info=new FileInfo(FILENAME, position);
			oos.writeObject(info);
			
			raf=new RandomAccessFile(DEST_PATH+FILENAME, "rw");
			InputStream in=socket.getInputStream();
			//定位
			raf.seek(position);
			byte[] buffer=new byte[512];
			int len;
			System.out.println(FILENAME+"開始下載！");
			while((len=in.read(buffer))!=-1&&isContinue){
				raf.write(buffer, 0, len);
				position+=len;
			}
			position=isContinue?0:position;
			savePosition(position);
			if(isContinue){
				System.out.println(FILENAME+"下載完畢！");
			}else{
				System.out.println(FILENAME+"下載被終止！");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null){
					oos.close();
				}
				if(raf!=null){
					raf.close();
				}
				if(socket!=null){
					socket.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static long readPosition(){
		long position=0;
		DataInputStream dis=null;
		File file=new File(DEST_PATH+RECORD_FILENAME);
		if(!file.exists()){
			return 0;
		}
		try {
			dis=new DataInputStream(new FileInputStream(file));
			position=dis.readLong();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dis!=null){
					dis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return position;
	}
	static void savePosition(long position){
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream(DEST_PATH+RECORD_FILENAME));
			dos.writeLong(position);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dos!=null){
					dos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
