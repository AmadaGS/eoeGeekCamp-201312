package com.example.baidumapreversemap;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.baidu.mapapi.GeoPoint;
import com.baidu.mapapi.MKAddrInfo;
import com.baidu.mapapi.MKBusLineResult;
import com.baidu.mapapi.MKDrivingRouteResult;
import com.baidu.mapapi.MKPoiResult;
import com.baidu.mapapi.MKSearchListener;
import com.baidu.mapapi.MKSuggestionResult;
import com.baidu.mapapi.MKTransitRouteResult;
import com.baidu.mapapi.MKWalkingRouteResult;
import com.baidu.mapapi.MapView;
import com.baidu.mapapi.PoiOverlay;
import com.baidu.mapapi.RouteOverlay;

public class MySearchListener implements MKSearchListener {
	MapView mapView;
	Context context;

	public MySearchListener(Context context, MapView mapView) {
		super();
		this.mapView = mapView;
		this.context = context;
	}

	@Override
	public void onGetAddrResult(MKAddrInfo res, int error) {
		// TODO Auto-generated method stub
		if (error != 0) {
			String msg = String.format("错误号： %d", error);
			Toast.makeText(context, msg, 1).show();
			return;
		}
		mapView.getController().animateTo(res.geoPt);
		String msg = String.format("经度: %f 纬度: %f\f\n",
				res.geoPt.getLongitudeE6() / 1e6,
				res.geoPt.getLatitudeE6() / 1e6);
		Drawable drawable = context.getResources().getDrawable(
				R.drawable.eat_icon);
		// 让图片直接标识在图上，设置位置
		drawable.setBounds(0, 0, drawable.getIntrinsicWidth(),
				drawable.getIntrinsicHeight());
		mapView.getOverlays().clear();
		//创建一个图层
		//mapView.getOverlays().add(object)
	}

	@Override
	public void onGetBusDetailResult(MKBusLineResult arg0, int arg1) {
		// TODO Auto-generated method stub
		if(arg0==null || arg1!=0){
			Toast.makeText(context, "未找到结果", 1);
			return;
		}
		RouteOverlay overlay=new RouteOverlay((Activity) context, mapView);
		overlay.setData(arg0.getBusRoute());//获得公交线路图
		mapView.getOverlays().clear();//清除公交站点的标识
		mapView.getOverlays().add(overlay);//描述到控件
		mapView.invalidate();
		//采用动画的形式描述公交站点
		mapView.getController().animateTo(arg0.getBusRoute().getStart());
	}

	@Override
	public void onGetDrivingRouteResult(MKDrivingRouteResult arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGetPoiDetailSearchResult(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGetPoiResult(MKPoiResult res, int type, int error) {
		// TODO Auto-generated method stub
		if (res == null || error != 0) {
			Toast.makeText(context, "解析失败", 1).show();
			return;
		}
		PoiOverlay overlay=new PoiOverlay((Activity) context, mapView);
		overlay.setData(res.getAllPoi());
		mapView.getOverlays().add(overlay);
		// 查找的点数》0
//		if (res != null && res.getCurrentNumPois() > 0) {
//			GeoPoint point = res.getAllPoi().get(0).pt;
//			mapView.getController().animateTo(point);// 将查找到的点标注在地图上
//			// 从point 中取出经纬度
//			String msg = String.format("经度: %f 纬度: %f\f\n",
//					point.getLongitudeE6() / 1e6, point.getLatitudeE6() / 1e6);
//			msg += "\r\n附近有";
//			for (int i = 0; i < res.getAllPoi().size(); i++) {
//				msg += (res.getAllPoi().get(i).name + ";");
//			}
//			Toast.makeText(context, msg, 1).show();
//
//		}
	}

	@Override
	public void onGetRGCShareUrlResult(String arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGetSuggestionResult(MKSuggestionResult arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGetTransitRouteResult(MKTransitRouteResult arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGetWalkingRouteResult(MKWalkingRouteResult arg0, int arg1) {
		// TODO Auto-generated method stub

	}
	

}
