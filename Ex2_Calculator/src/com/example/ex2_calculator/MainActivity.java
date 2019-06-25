package com.example.ex2_calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;  
import android.view.View.OnClickListener;  
import android.widget.Button;  
import android.widget.EditText;  
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText edittext1,edittext2;  
	private Button Btn_Add ;  
	private Button Btn_Sub ;
	private Button Btn_Mul ;
	private Button Btn_Div ;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 addListenerOnButton();  
	}
	public void addListenerOnButton(){  
        edittext1=(EditText)findViewById(R.id.editText1);  
        edittext2=(EditText)findViewById(R.id.editText2);  
        Btn_Add=(Button)findViewById(R.id.button1);
        Btn_Sub=(Button)findViewById(R.id.button2);
        Btn_Mul=(Button)findViewById(R.id.button3); 
        Btn_Div=(Button)findViewById(R.id.button4); 
        
          
        Btn_Add.setOnClickListener(new OnClickListener(){  
  
            @Override  
            public void onClick(View view) {  
                String value1=edittext1.getText().toString();  
                String value2=edittext2.getText().toString();  
                int a=Integer.parseInt(value1);  
                int b=Integer.parseInt(value2);  
                int sum=a+b;  
    Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();  
            }  
              
        });
            Btn_Sub.setOnClickListener(new OnClickListener(){  
            	  
                @Override  
                public void onClick(View view) {  
                    String value1=edittext1.getText().toString();  
                    String value2=edittext2.getText().toString();  
                    int a=Integer.parseInt(value1);  
                    int b=Integer.parseInt(value2);  
                    int sub=a-b;  
        Toast.makeText(getApplicationContext(),String.valueOf(sub),Toast.LENGTH_LONG).show();  
                }  
        });  
            
            Btn_Mul.setOnClickListener(new OnClickListener(){  
            	  
                @Override  
                public void onClick(View view) {  
                    String value1=edittext1.getText().toString();  
                    String value2=edittext2.getText().toString();  
                    int a=Integer.parseInt(value1);  
                    int b=Integer.parseInt(value2);  
                    int m=a*b;  
        Toast.makeText(getApplicationContext(),String.valueOf(m),Toast.LENGTH_LONG).show();  
                }  
                  
            });
            Btn_Div.setOnClickListener(new OnClickListener(){  
          	  
                @Override  
                public void onClick(View view) {  
                    String value1=edittext1.getText().toString();  
                    String value2=edittext2.getText().toString();  
                    int a=Integer.parseInt(value1);  
                    int b=Integer.parseInt(value2);  
                    int n=a/b;  
        Toast.makeText(getApplicationContext(),String.valueOf(n),Toast.LENGTH_LONG).show();  
                }  
                  
            });  
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
