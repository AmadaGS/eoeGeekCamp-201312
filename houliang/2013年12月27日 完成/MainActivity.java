package com.example.baidumapsum;

import java.util.Map;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.GeoPoint;
import com.baidu.mapapi.MKGeneralListener;
import com.baidu.mapapi.MKPlanNode;
import com.baidu.mapapi.MKSearch;
import com.baidu.mapapi.MapActivity;
import com.baidu.mapapi.MapController;
import com.baidu.mapapi.MapView;
import com.baidu.mapapi.Overlay;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.NoCopySpan.Concrete;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 实现两地之间公交换乘，步行路线
 * 公交路线检索
 * 地点坐标标注 
 * @author Administrator
 * 
 */
public class MainActivity extends MapActivity implements OnClickListener {
	private MapView mapView;
	private BMapManager bMapManager;//加载地图引擎
	private MKSearch mkSearch;//百度地图的检索服务
	//百度地图开发所申请的key
	private String key = "C0EF05A481CAA729C2EE7AF6152EE1868FA1E755";
	private MKPlanNode start, end;
	private Button mbtnTrans, mbtnWalk, mbtnDrive, mbtnLine, mbtnAdress;
	private EditText metStart, metEnd, metLine, metAdress;
	private MapController controller;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();//初始化控件
		mapView.setBuiltInZoomControls(true);//表示可以设置缩放功能
		controller=mapView.getController();//实例化mapcontroller
		bMapManager = new BMapManager(this);//地图引擎管理类
		//加载百度地图 必须要加载key
		bMapManager.init(key, new MKGeneralListener() {
			//监听授权结果
			@Override
			public void onGetPermissionState(int arg0) {
				// TODO Auto-generated method stub
				if (arg0 == 300) {
					Toast.makeText(MainActivity.this, "输入的key有误", 1);
				}
			}

			@Override
			public void onGetNetworkState(int arg0) {
				// TODO Auto-generated method stub
			}
		});
		
		initMapActivity(bMapManager);//初始化activiy
		mkSearch = new MKSearch();
		mkSearch.init(bMapManager,
				new MySearchListener(this, mapView, mkSearch));
	}

	private void initView() {
		mapView = (MapView) findViewById(R.id.bmapview);
		mbtnTrans = (Button) findViewById(R.id.btnTrans);
		mbtnWalk = (Button) findViewById(R.id.btnWalk);
		mbtnLine = (Button) findViewById(R.id.btnLine);
		mbtnDrive = (Button) findViewById(R.id.btnDrive);
		mbtnAdress = (Button) findViewById(R.id.btnAdress);
		metStart = (EditText) findViewById(R.id.etStart);
		metEnd = (EditText) findViewById(R.id.etEnd);
		metLine = (EditText) findViewById(R.id.etLine);
		metAdress = (EditText) findViewById(R.id.etAdress);
		mbtnDrive.setOnClickListener(this);
		mbtnTrans.setOnClickListener(this);
		mbtnWalk.setOnClickListener(this);
		mbtnLine.setOnClickListener(this);
		mbtnAdress.setOnClickListener(this);
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

	//程序退出时调用此方法
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if (bMapManager != null) {
			bMapManager.destroy();
		}
	}

	//开启百度地图API
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if (bMapManager != null) {
			bMapManager.start();
			mapView.invalidate();
		}
	}
	//停止百度地图API
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if (bMapManager != null) {
			bMapManager.stop();
		}
	}
	//监听控件操作
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		//驾车路线图
		case R.id.btnDrive:
			initPlanNode();
			mkSearch.drivingSearch(null, start, null, end);
			break;
		//地址搜索图
		case R.id.btnAdress:
			mapView.getOverlays().clear();//清除原有覆盖物
			mapView.invalidate();//刷新地图
			//获取控件输入地址转换成的经纬度
			GeoPoint geo=getGeo(metAdress.getText().toString());
			//获取mapview的控制器
			controller=mapView.getController();
			//设置地图中心点
			controller.setCenter(geo);
			//获取贴图
			Drawable drawable = getResources().getDrawable(R.drawable.eat_icon);
			//创建覆盖物列表
			MyOverLayItem overLayItem = new MyOverLayItem(drawable, mapView,
					this,geo );
			//添加一个覆盖物对象
			mapView.getOverlays().add(overLayItem);
			break;
		//乘坐公交路线图
		case R.id.btnTrans:
			initPlanNode();
			mkSearch.transitSearch("北京", start, end);
			break;
		//步行路线图
		case R.id.btnWalk:
			initPlanNode();
			mkSearch.walkingSearch(null, start, null, end);
			break;
		//查询谋一路公交具体路线图
		case R.id.btnLine:
			mkSearch.poiSearchInCity("北京", metLine.getText().toString());
		default:
			break;
		}
	}

	private void initPlanNode() {
		start = new MKPlanNode();
		end = new MKPlanNode();
		start.pt = getGeo(metStart.getText().toString());
		end.pt = getGeo(metEnd.getText().toString());
		controller=mapView.getController();//获取mapView控制权
		controller.setCenter(start.pt);//设置中心点
		controller.setZoom(12);
	}
	//根据地址获取地址的地理坐标GeoPoint
	public GeoPoint getGeo(String add) {
		GetGeoPoint address = new GetGeoPoint(key, add);
		GeoPoint geoPoint=address.getGeocoderLatitude();
		return geoPoint;
	}
}
