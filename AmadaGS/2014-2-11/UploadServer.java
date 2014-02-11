package com.eoe.se2.day07.upload;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UploadServer {

	static final String DEST_PATH="D:/JAVA_Test/dest/";
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		try {
			ServerSocket server=new ServerSocket(9988);
			System.out.println("等待客户端连接");
			while(true){
				Socket socket=server.accept();
				pool.execute(new UploadTask(socket));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static class UploadTask implements Runnable{
		
		Socket socket;
		public UploadTask() {
			// TODO Auto-generated constructor stub
		}
		public UploadTask(Socket socket) {
			super();
			this.socket = socket;
		}
		@Override
		public void run() {
			ObjectInputStream ois=null;
			RandomAccessFile raf=null;
			try {
				ois=new ObjectInputStream(socket.getInputStream());
				FileInfo info=(FileInfo) ois.readObject();
				InputStream in=socket.getInputStream();
				raf=new RandomAccessFile(DEST_PATH+info.getFileName(), "rw");
				raf.seek(info.getPosition());
				byte[] buffer=new byte[1024];
				int len;
				while((len=in.read(buffer))!=-1){
					raf.write(buffer,0,len);
				}
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(ois!=null){
						ois.close();
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
	}
}
