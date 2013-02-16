package com.example.cambioactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActividad extends Activity{

	TextView tv;
	Bundle bundle_receptor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vista_dos_layout);
	    Button b = (Button)findViewById(R.id.regresar);
	    tv = (TextView)findViewById(R.id.tv_capturado);
	    
	    bundle_receptor = getIntent().getExtras();
	    tv.setText("Por bundle: "+bundle_receptor.getString("key_texto")
	    		+"\nPor intent: " + bundle_receptor.getString("clave_extra")
	    		);
	    
	    
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(SegundaActividad.this, MainActivity.class);
				
				startActivity(i);
				finish();
			}
		});
	}
	
}
