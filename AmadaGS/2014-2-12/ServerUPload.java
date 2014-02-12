package com.eoe.se2.day07.upload00;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerUPload {

	static final String DEST_PATH="D:/JAVA_Test/dest/";
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		System.out.println("等待客户端连接");
		try {
			ServerSocket server=new ServerSocket(9999);
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
				raf=new RandomAccessFile(DEST_PATH+info.getFileName(), "rw");
				raf.seek(info.getPosition());
				InputStream in=socket.getInputStream();
				byte[] buffer=new byte[1024];
				int len;
				while((len=in.read(buffer))!=-1){
					raf.write(buffer, 0, len);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(raf!=null){
						raf.close();
					}
					if(ois!=null){
						ois.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
