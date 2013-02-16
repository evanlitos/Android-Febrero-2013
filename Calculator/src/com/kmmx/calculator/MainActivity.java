package com.kmmx.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	TextView visor;
	Button n6,n5,n4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visor= (TextView)findViewById(R.id.visor);
        n6 = (Button)findViewById(R.id.n6);
        n5 = (Button)findViewById(R.id.n5);
        n4 = (Button)findViewById(R.id.n4);
        
        n6.setOnClickListener(numeros);
        n5.setOnClickListener(numeros);
        n4.setOnClickListener(numeros);
        
    }
    
    public void input7(View v){
    	visor.setText(visor.getText());
    }
    public void input8(View v){
    	visor.setText(visor.getText().toString()+"8");
    }
    public void input9(View v){
    	visor.setText(visor.getText().toString()+"9");
    }
    public void inputDiv(View v){
    	visor.setText("/");
    }
    
    OnClickListener numeros = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.n6:
				visor.setText(visor.getText().toString()+"6");
				break;
			case R.id.n5:
				visor.setText(visor.getText().toString()+"5");
				break;
			case R.id.n4:
				visor.setText(visor.getText().toString()+"4");
				break;
			}
			
		}
	};
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	}
