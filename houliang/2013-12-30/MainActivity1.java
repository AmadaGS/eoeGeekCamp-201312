package com.example.getproint;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	

	private LocationClient mLocationClient = null;
	private Button mStartBtn = null;
	private TextView mTextView = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mStartBtn = (Button)findViewById(R.id.btn);
        mTextView = (TextView)findViewById(R.id.tv);
        
        mLocationClient = new LocationClient(this);
        LocationClientOption option = new LocationClientOption();
        option.setOpenGps(true);								//打开gps
        option.setCoorType("bd09ll");							//设置坐标类型为bd09ll
        //option.setPriority(LocationClientOption.NetWorkFirst);	//设置网络优先
        option.setProdName("locSDKDemo2");						//设置产品线名称
        option.setScanSpan(5000);								//定时定位，每隔5秒钟定位一次。
        mLocationClient.setLocOption(option);
        mLocationClient.registerLocationListener(new BDLocationListener() {
			@Override
			public void onReceiveLocation(BDLocation location) {
				if (location == null)
					return ;
				StringBuffer sb = new StringBuffer(256);
				sb.append("time : ");
				sb.append(location.getTime());
				sb.append("\nerror code : ");
				sb.append(location.getLocType());
				sb.append("\nlatitude : ");
				sb.append(location.getLatitude());
				sb.append("\nlontitude : ");
				sb.append(location.getLongitude());
				sb.append("\nradius : ");
				sb.append(location.getRadius());
				if (location.getLocType() == BDLocation.TypeGpsLocation){
					sb.append("\nspeed : ");
					sb.append(location.getSpeed());
					sb.append("\nsatellite : ");
					sb.append(location.getSatelliteNumber());
				} else if (location.getLocType() == BDLocation.TypeNetWorkLocation){
					sb.append("\naddr : ");
					sb.append(location.getAddrStr());
				}
				sb.append("\nsdk version : ");
				sb.append(mLocationClient.getVersion());
				mTextView.setText(sb.toString());
			}
			
	        public void onReceivePoi(BDLocation location){
	        	//return ;
	        }
		});
        
        
        mStartBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (mLocationClient == null) return ;
				if (mLocationClient.isStarted()){
					mLocationClient.stop();
					mStartBtn.setText("开始");
				} else {
					mLocationClient.start();
					mStartBtn.setText("关闭");
				}
			}
		});
        
    }
    
    @Override
    public void onDestroy(){
    	if (mLocationClient != null && mLocationClient.isStarted()){
    		mLocationClient.stop();
    		mLocationClient = null;
    	}
    	super.onDestroy();
    }

}
