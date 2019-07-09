package com.example.datatransfer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Intent in;
	Button b1;
	EditText t1, t2;
	
	String strname, strregno;
	int reg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		t1=(EditText)findViewById(R.id.editText1);
		t2=(EditText)findViewById(R.id.editText2);
		
		
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		
				strname=t1.getText().toString();
				strregno=t2.getText().toString();
				reg=Integer.parseInt(strregno);
				
				//Toast.makeText(getApplicationContext(), "Data:"+strname+"\n"+reg, Toast.LENGTH_LONG).show();
				
				in=new Intent(getApplicationContext(), Second_Activity.class);
				
				in.putExtra("MyName", strname);
				in.putExtra("MyReg", reg);
				startActivity(in);
				
				
			}
		});
		
	}

}
