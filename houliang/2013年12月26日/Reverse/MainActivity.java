package com.example.baidumapreversemap;

import java.util.ArrayList;
import java.util.List;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.GeoPoint;
import com.baidu.mapapi.ItemizedOverlay;
import com.baidu.mapapi.MKGeneralListener;
import com.baidu.mapapi.MKSearch;
import com.baidu.mapapi.MapActivity;
import com.baidu.mapapi.MapView;
import com.baidu.mapapi.Overlay;
import com.baidu.mapapi.OverlayItem;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends MapActivity implements OnClickListener{
	BMapManager bMapManager;
	String key="C0EF05A481CAA729C2EE7AF6152EE1868FA1E755";
	public MKSearch mkSearch;
	MapView mapView;
	Button mbtnLine,mbtnAdress;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mapView=(MapView) findViewById(R.id.bmapview);
		mbtnAdress=(Button) findViewById(R.id.btnAddress);
		mbtnAdress.setOnClickListener(this);
		mbtnLine=(Button) findViewById(R.id.btnLine);
		mbtnLine.setOnClickListener(this);
		bMapManager=new BMapManager(this);
		bMapManager.init(key, new MKGeneralListener() {
			
			@Override
			public void onGetPermissionState(int arg0) {
				// TODO Auto-generated method stub
				if(arg0==300){
					Toast.makeText(MainActivity.this, "输入的key有误", 1);
				}
				
			}
			
			@Override
			public void onGetNetworkState(int arg0) {
			}
		});
		bMapManager.start();
		initMapActivity(bMapManager);
		mapView.setBuiltInZoomControls(true);//设置中心点
		mkSearch=new MKSearch();
		mkSearch.init(bMapManager, new MySearchListener(this,mapView));
		
		
	}
	public class OverItemT extends ItemizedOverlay<OverlayItem>{
		//可以从服务器端接收一组经纬度标注在地图上
		List<OverlayItem> list=new ArrayList<OverlayItem>();
		public OverItemT(Drawable marker,Context context,GeoPoint geoPoint,String title) {
			super(boundCenterBottom(marker));
			list.add(new OverlayItem(geoPoint, title, null));
			//刷新下地图
			populate();
		}

		@Override
		protected OverlayItem createItem(int arg0) {
			// TODO Auto-generated method stub
			return list.get(arg0);
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return list.size();
		}
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if(bMapManager!=null){
			bMapManager.destroy();
			bMapManager=null;
		}
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if(bMapManager!=null){
			bMapManager.start();
		}
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if(bMapManager!=null){
			bMapManager.start();
		}
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnAddress:
			mapView.getOverlays().clear();//清除公交站点的标识
			mapView.invalidate();
			GeoPoint geoPoint=new GeoPoint((int)(39.915*1e6),(int)(116.454*1e6));
			EditText tvAdr=(EditText) findViewById(R.id.etAddress);
			//根据中心点geoPoint在1000半径内查询KFC
			mkSearch.poiSearchNearBy(tvAdr.getText().toString(), geoPoint, 5000);
//			GeoPoint geoPoint=new GeoPoint(39904965, 116327764);
//			mkSearch.reverseGeocode(geoPoint);
			break;
		case R.id.btnLine:	
			mapView.getOverlays().clear();//清除公交站点的标识
			EditText etLine=(EditText) findViewById(R.id.etLine);
			mkSearch.poiSearchInCity("北京", etLine.getText().toString());
//			EditText etadd=(EditText) findViewById(R.id.etAddress);
//			mkSearch.geocode("北京", etadd.getText().toString());
			break;

		default:
			break;
		}
	}
}
