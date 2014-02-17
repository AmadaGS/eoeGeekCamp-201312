package com.eoe.se2_day11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Test05 {

	static final String BASE_URL = "http://127.0.0.1/ADT-22.3.0.zip";
	static final String FILENAME = "ADT-22.3.0.zip";
	static final String DEST_PATH = "D:/JAVA_Test/dest/";

	public static void main(String[] args) {
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet(BASE_URL);
		FileOutputStream fos = null;
		try {
			HttpResponse response = client.execute(get);
			if (response.getStatusLine().getStatusCode() == 200) {
				fos = new FileOutputStream(DEST_PATH + FILENAME);
				InputStream in = response.getEntity().getContent();
				byte[] buffer = new byte[1024 * 10];
				int len;
				System.out.println("開始下載");
				while ((len = in.read(buffer)) != -1) {
					fos.write(buffer, 0, len);
				}
				System.out.println(FILENAME + "下載完畢！");
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
