package com.eoe.se2.day07.upload;

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

public class UploadClient {

	static final String SRC_PATH="D:/JAVA_Test/SRC/";
	static final String FILENAME="adt-bundle-windows-x86_64-20130522.zip";
	private static final String RECORD_FILENAME="adt-record.dat";
	static boolean isContinue=true;
	
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				System.out.println("按任意键终止上传");
				new Scanner(System.in).next();
				isContinue=false;
			}
		}.start();
		RandomAccessFile raf=null;
		ObjectOutputStream oos=null;
		try {
			Socket socket=new Socket("127.0.0.1", 9988); 
			long position=readPosition();
			raf=new RandomAccessFile(SRC_PATH+FILENAME, "r");
			raf.seek(position);
			//
			OutputStream out=socket.getOutputStream();
			oos=new ObjectOutputStream(out);
			FileInfo info=new FileInfo(FILENAME, position);
			oos.writeObject(info);
			System.out.println(FILENAME+"开始上传");
			byte[] buffer=new byte[1024];
			int len;
			while((len=raf.read(buffer))!=-1&&isContinue){
				out.write(buffer, 0, len);
				position+=len;
			}
			position=isContinue?0:position;
			if(isContinue){
				System.out.println(FILENAME+"上传完毕");
			}else{
				System.out.println(FILENAME+"上传终止");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(raf!=null){
				  raf.close();
				}
				if(oos!=null){
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static long readPosition(){
		long position=0;
		ObjectInputStream ois=null;
		try {
			File file=new File(SRC_PATH+RECORD_FILENAME);
			if(!file.exists()){
				return 0;
			}
			ois=new ObjectInputStream(new FileInputStream(file));
			FileInfo info=(FileInfo) ois.readObject();
			position=info.getPosition();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return position;
	}
	static void savePosition(long position){
		ObjectOutputStream oos=null;
		try {
			FileInfo info=new FileInfo(FILENAME, position);
			oos=new ObjectOutputStream(new FileOutputStream(SRC_PATH+RECORD_FILENAME));
			oos.writeObject(info);
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
}
