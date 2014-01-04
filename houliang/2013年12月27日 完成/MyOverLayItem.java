package com.example.baidumapsum;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.baidu.mapapi.GeoPoint;
import com.baidu.mapapi.ItemizedOverlay;
import com.baidu.mapapi.MapView;
import com.baidu.mapapi.OverlayItem;

public class MyOverLayItem extends ItemizedOverlay<OverlayItem> {
	private Drawable drawable;
	private MapView mapView;
	private Context context;
	private GeoPoint geoPoint;
	private List<OverlayItem> list = new ArrayList<OverlayItem>();

	public MyOverLayItem(Drawable drawable, MapView mapView, Context context,
			GeoPoint geoPoint) {
		super(drawable);
		this.drawable = drawable;
		this.mapView = mapView;
		this.context = context;
		list.add(new OverlayItem(geoPoint, "Point1", "Point1"));
		populate();//刷新地图
	}

	@Override
	protected OverlayItem createItem(int arg0) {
		return list.get(arg0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}
	//处理一个点击事件
	@Override
	public boolean onTap(int i) {
		Toast.makeText(context, list.get(i).getSnippet(), 1).show();
		return true;
	}

}
