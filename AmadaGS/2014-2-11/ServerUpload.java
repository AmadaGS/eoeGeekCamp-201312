package com.eoe.se2.day06.socket04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerUpload {
	static final String DEST_PATH="D:/JAVA_Test/dest/";
	
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()*50);
		try {
			ServerSocket server=new ServerSocket(8899);
			System.out.println("µÈ´ý¿Í‘ô¶ËßB½Ó...");
			while(true){
				Socket socket=server.accept();
				pool.execute(new UPloadRTask(socket));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static class UPloadRTask implements Runnable{
		Socket socket;
		
		public UPloadRTask(Socket socket) {
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
				int len;
				InputStream in=socket.getInputStream();
				byte[] buffer=new byte[1024];
				while((len=in.read(buffer))!=-1){
					raf.write(buffer,0,len);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
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
					if(socket!=null){
						socket.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
