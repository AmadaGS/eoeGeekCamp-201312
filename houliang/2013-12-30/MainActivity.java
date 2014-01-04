package com.example.sharedpre;
import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText mEt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mEt=(EditText) findViewById(R.id.et);
		SharedPreferences  sp=this.getSharedPreferences("name", this.MODE_PRIVATE);
		String name=sp.getString("name", "Ä¬ÈÏÖµ");
		mEt.setText(name);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		SharedPreferences sp=getSharedPreferences("name", this.MODE_APPEND);
		Editor editor=sp.edit();
		editor.putString("name", mEt.getText().toString());
		Toast.makeText(this, mEt.getText().toString(), 1).show();
		editor.commit();
		
	}
	
}
