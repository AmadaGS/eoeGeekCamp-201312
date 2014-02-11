package com.eoe.se2.day06.socket04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CilentUpload {
	static final String SRC_PATH="D:/JAVA_Test/SRC/";
	static final String FILENAME="adt-bundle-windows-x86_64-20130522.zip";
	private static final String RECORD_FILENAME="adt-record.dat";
	static boolean isContinue=true;
	
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				System.out.println("按任意鍵停止上傳：");
				String quit=new Scanner(System.in).next();
				isContinue=false;
			}
		}.start();
		RandomAccessFile raf=null;
		ObjectOutputStream oos=null;
		try {
			Socket socket=new Socket("127.0.0.1",8899);
			//
			long position=readPositoin();
			raf=new RandomAccessFile(SRC_PATH+FILENAME, "r");
			raf.seek(position);
			//
			OutputStream out=socket.getOutputStream();
			oos=new ObjectOutputStream(out);
			FileInfo info=new FileInfo(FILENAME, position);
			oos.writeObject(info);
			byte[] buffer=new byte[512];
			int len;
			System.out.println(info.getFileName()+"开始上传");
			while((len=raf.read(buffer))!=-1&&isContinue){
				out.write(buffer, 0, len);
				position+=len;
			}
			//System.out.println(info.getFileName()+"上传完毕！");
			position=isContinue?0:position;
			savePosition(position);
			if(isContinue){
				System.out.println(info.getFileName()+"上传完毕le ！");;
			}else{
				System.out.println(info.getFileName()+"上传被终止！");
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

	 static void savePosition(long position) {
		ObjectOutputStream oos=null;
		try {
			FileInfo info=new FileInfo(FILENAME, position);
			oos=new ObjectOutputStream(new FileOutputStream(SRC_PATH+RECORD_FILENAME));
			oos.writeObject(info);
		} catch (FileNotFoundException e) {
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
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	 static long readPositoin() {
		ObjectInputStream ois=null;
		long position=0;
		try {
			File file=new File(SRC_PATH+RECORD_FILENAME);
			if(!file.exists()){
				return 0;
			}
			ois=new ObjectInputStream(new FileInputStream(file));
			FileInfo info=(FileInfo) ois.readObject();
			position=info.getPosition();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(ois!=null){
					ois.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return position;
	}
}