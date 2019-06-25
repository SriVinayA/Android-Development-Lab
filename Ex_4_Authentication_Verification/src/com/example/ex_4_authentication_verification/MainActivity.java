package com.example.ex_4_authentication_verification;

import android.os.Bundle;
import android.widget.*;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;  

public class MainActivity extends Activity {
	EditText uname, pass;
	Button blog, bclear;
	
    @Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
addListenerOnButton();  
    }
    
public void addListenerOnButton(){  
uname=(EditText)findViewById(R.id.editText1);
pass=(EditText)findViewById(R.id.editText2);
blog=(Button)findViewById(R.id.button1);
bclear=(Button)findViewById(R.id.button2);

blog.setOnClickListener(new OnClickListener()
{  
	  
    @Override  
    public void onClick(View view) {  
    	String na=uname.getText().toString();
		String p=pass.getText().toString();
		if(na.equals("admin") &&p.equals("admin"))
			Toast.makeText(getApplicationContext(), "Authenticated...", Toast.LENGTH_LONG).show();
		else
		{
			Toast.makeText(getApplicationContext(), "Un Authenticated...", Toast.LENGTH_LONG).show();
			uname.setText("");
			pass.setText("");
		}
		
    }  
      
});

bclear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				
				uname.setText("");
				pass.setText("");
			}
		});


    }

}
