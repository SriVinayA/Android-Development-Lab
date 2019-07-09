package com.example.message;

import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button mybtn;
	EditText txtph, txtmsg;
	String strph, strmsg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mybtn=(Button)findViewById(R.id.btnSMS);
		txtph=(EditText)findViewById(R.id.txtPhone);
		txtmsg=(EditText)findViewById(R.id.txtMessage);
		
		mybtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				strph=txtph.getText().toString();
				strmsg=txtmsg.getText().toString();
				if(strph.length()>0 && strmsg.length()>0)
				{
					sendSMS(strph, strmsg);
				}
				else
				{
					Toast.makeText(MainActivity.this, "Please type the correct phone number and message", Toast.LENGTH_LONG).show();
				}
				
			}

			private void sendSMS(String phone, String message) {
				// TODO Auto-generated method stub
				
				String SENT="SMS_SENT";
				String DELIVERED="SMS_DELIVERED";
				PendingIntent sentPI=PendingIntent.getBroadcast(MainActivity.this, 0, new Intent(SENT), 0);
				PendingIntent deliveredPI=PendingIntent.getBroadcast(MainActivity.this, 0, new Intent(DELIVERED), 0);
				
				registerReceiver(new BroadcastReceiver() {
					
					@Override
					public void onReceive(Context arg0, Intent arg1) {
						// TODO Auto-generated method stub
						
						switch(getResultCode())
						{
						case Activity.RESULT_OK:
							Toast.makeText(MainActivity.this, "SMS Sent", Toast.LENGTH_LONG).show();
							break;
						case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
							Toast.makeText(MainActivity.this, "Generic failure...", Toast.LENGTH_LONG).show();
							break;
						}
						
					}
				}, new IntentFilter());
				
				SmsManager sms=SmsManager.getDefault();
				sms.sendTextMessage(phone, null, message, sentPI, deliveredPI);
				
				
			}
			
		});
		
	}

}
