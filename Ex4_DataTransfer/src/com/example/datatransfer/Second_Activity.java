package com.example.datatransfer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Second_Activity extends Activity {

	TextView tv1, tv2;
	Intent in;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_second_);
		
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		
		in=getIntent();
		
		tv1.setText(in.getStringExtra("MyName"));
		
		
		
		
		
	}
	
}
