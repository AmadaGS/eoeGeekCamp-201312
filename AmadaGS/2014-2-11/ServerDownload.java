package com.eoe.se2.day07.download;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.eoe.se2.day06.socket04.FileInfo;

public class ServerDownload {

	static final String SRC_PATH = "D:/JAVA_Test/src/";

	public static void main(String[] args) {
		ExecutorService pools = Executors.newCachedThreadPool();
		try {
			ServerSocket server=new ServerSocket(9988);
			System.out.println("等待客戶端的連接");
			while(true){
				Socket socket=server.accept();
				pools.execute(new DownloadTask(socket));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static class DownloadTask implements Runnable {
		Socket socket;

		public DownloadTask(Socket socket) {
			super();
			this.socket = socket;
		}

		@Override
		public void run() {
			ObjectInputStream ois = null;
			RandomAccessFile raf = null;
			try {
				ois = new ObjectInputStream(socket.getInputStream());
				FileInfo info = (FileInfo) ois.readObject();
				raf = new RandomAccessFile(SRC_PATH + info.getFileName(), "r");
				OutputStream out = socket.getOutputStream();
				byte[] buffer = new byte[1024];
				int len;
				raf.seek(info.getPosition());
				while ((len = raf.read(buffer)) != -1) {
					out.write(buffer, 0, len);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (raf != null) {
						raf.close();
					}
					if (ois != null) {
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
