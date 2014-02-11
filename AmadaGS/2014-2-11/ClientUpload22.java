package com.eoe.se2.day06.socket04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientUpload22 {

	private static final String SRC_PATH="D:/JAVA_Test/SRC/";
	private static final String FILENAME="eclipse-SDK-3.5.2-win32.zip";
	private static final String RECORD_FILENAME="eclipse-SDK-RECORD.dat";
	private static boolean isContinue=true;
	
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				System.out.println("按任意键停止文件上传");
				new Scanner(System.in).next();
				isContinue=false;
			};
		}.start();
		ObjectOutputStream oos=null;
		RandomAccessFile raf=null;
		try {
			Socket socket=new Socket("127.0.0.1",8899);
			oos=new ObjectOutputStream(socket.getOutputStream());
			long position=readPosition();
			FileInfo info=new FileInfo(FILENAME, position);
			oos.writeObject(info);
			raf=new RandomAccessFile(SRC_PATH+info.getFileName(), "r");
			raf.seek(position);
			OutputStream out=socket.getOutputStream();
			byte[] buffer=new byte[1024];
			int len;
			System.out.println(FILENAME+"开始上传。");
			while((len=raf.read(buffer))!=-1&&isContinue){
				out.write(buffer, 0, len);
				position+=len;
			}
			position=isContinue?0:position;
			savePosition(position);
			if(isContinue){
				System.out.println(info.getFileName()+"文件上传完毕！");
			}else{
				System.out.println(info.getFileName()+"文件被终止！");
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
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static void savePosition(long position){
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream(SRC_PATH+RECORD_FILENAME));
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
	static long readPosition(){
		long position=0;
		DataInputStream dis=null;
		try {
			File file=new File(SRC_PATH+RECORD_FILENAME);
			if(!file.exists()){
				return 0;
			}
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
}
