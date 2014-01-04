package com.example.baidumapsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.baidu.mapapi.GeoPoint;

import android.R.integer;

public class GetGeoPoint {
	private String key;
	private String address;

	public GetGeoPoint(String key, String address) {
		super();
		this.key = key;
		this.address = address;
	}

	/**
	 * 返回输入地址的经纬度坐标 key lng(经度),lat(纬度)
	 */
	public GeoPoint getGeocoderLatitude() {
		BufferedReader in = null;
		GeoPoint geoPoint;
		try {
			// 将地址转换成utf-8的16进制
			address = URLEncoder.encode(address, "UTF-8");
			URL tirc = new URL("http://api.map.baidu.com/geocoder?address="
					+ address + "&output=json&key=" + key);
			in = new BufferedReader(new InputStreamReader(tirc.openStream(),
					"UTF-8"));
			String res;
			StringBuilder sb = new StringBuilder("");
			while ((res = in.readLine()) != null) {
				sb.append(res.trim());
			}
			String str = sb.toString();
			Map<String, Integer> map = null;

			int lngStart = str.indexOf("lng\":");
			int lngEnd = str.indexOf(",\"lat");
			int latEnd = str.indexOf("},\"precise");
			if (lngStart > 0 && lngEnd > 0 && latEnd > 0) {
				String lng = str.substring(lngStart + 5, lngEnd);
				String lat = str.substring(lngEnd + 7, latEnd);
				map = new HashMap<String, Integer>();
				double ln = Double.parseDouble(lng);
				double la = Double.parseDouble(lat);
				double ln2 = ln * 1e6;
				double la2 = la * 1e6;
				int ln3 = (int) ln2;
				int la3 = (int) la2;
				geoPoint=new GeoPoint(la3, ln3);
				
				return geoPoint;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
