package com.example.baidumapsum;
import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.baidu.mapapi.MKAddrInfo;
import com.baidu.mapapi.MKBusLineResult;
import com.baidu.mapapi.MKDrivingRouteResult;
import com.baidu.mapapi.MKPoiInfo;
import com.baidu.mapapi.MKPoiResult;
import com.baidu.mapapi.MKSearch;
import com.baidu.mapapi.MKSearchListener;
import com.baidu.mapapi.MKSuggestionResult;
import com.baidu.mapapi.MKTransitRouteResult;
import com.baidu.mapapi.MKWalkingRouteResult;
import com.baidu.mapapi.MapView;
import com.baidu.mapapi.PoiOverlay;
import com.baidu.mapapi.RouteOverlay;
import com.baidu.mapapi.TransitOverlay;

/**
 * 地图查询的事件监听器
 * @author Administrator
 *
 */
class MySearchListener implements MKSearchListener {
	Context context;
	MapView mapView;
	MKSearch mkSearch;
	
	public MySearchListener(Context context, MapView mapView, MKSearch mkSearch) {
		super();
		this.context = context;
		this.mapView = mapView;
		this.mkSearch = mkSearch;
	}
	
	@Override
	public void onGetAddrResult(MKAddrInfo arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	//后去公交路线详情
	@Override
	public void onGetBusDetailResult(MKBusLineResult arg0, int arg1) {
		// TODO Auto-generated method stub
		if(arg0==null || arg1!=0){
			Toast.makeText(context, "未找到结果", 1);
			return;
		}
		//创建一个覆盖物
		RouteOverlay overlay=new RouteOverlay((Activity) context, mapView);
		overlay.setData(arg0.getBusRoute());//获得公交线路图
		mapView.getOverlays().clear();//清除公交站点的标识
		mapView.getOverlays().add(overlay);//描述到控件
		mapView.invalidate();
		//采用动画的形式描述公交站点
		mapView.getController().animateTo(arg0.getBusRoute().getStart());
	}

	//获取驾车路线图
	@Override
	public void onGetDrivingRouteResult(MKDrivingRouteResult arg0, int arg1) {
		// TODO Auto-generated method stub
		if(arg0==null){
			return;
		}
		RouteOverlay overlay=new RouteOverlay((Activity) context, mapView);
		//两点之间的驾车路线有多条 选择其中第一条
		overlay.setData(arg0.getPlan(0).getRoute(0));
		mapView.getOverlays().clear();//清除公交站点的标识
		mapView.getOverlays().add(overlay);
		mapView.invalidate();
	}

	@Override
	public void onGetPoiDetailSearchResult(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGetPoiResult(MKPoiResult arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		mapView.getOverlays().clear();
		mapView.invalidate();
		if(arg0==null || arg2!=0){
			Toast.makeText((Activity)context, "未找到结果", 1);
			return;
		}
		//定义一个公交线路的描述类
		MKPoiInfo info=null;
		int totalNumb=arg0.getNumPois();
		for (int i = 0; i < totalNumb; i++) {
			info=arg0.getPoi(i);
			if(info.ePoiType==2){
				break;
			}
		}
		mkSearch.busLineSearch("北京", info.uid);
		
		
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
		if(arg0==null){
			return;
		}
		int planNum=arg0.getNumPlan();
		mapView.getOverlays().clear();//清除公交站点的标识
		//for(int i=0;i<planNum;i++){
		TransitOverlay overlay=new TransitOverlay((Activity) context, mapView);
		overlay.setData(arg0.getPlan(0));
		mapView.getOverlays().add(overlay);
		//}
		mapView.invalidate();
		//mapView.getController().animateTo(arg0.getStart().pt);
	}

	@Override
	public void onGetWalkingRouteResult(MKWalkingRouteResult arg0, int arg1) {
		// TODO Auto-generated method stub
		if (arg0 == null) {
			return;
		}
		RouteOverlay overlay = new RouteOverlay((Activity) context, mapView);
		overlay.setData(arg0.getPlan(0).getRoute(0));
		mapView.getOverlays().clear();//清除原来的标识
		mapView.getOverlays().add(overlay);
		mapView.invalidate();
	}
	

}
