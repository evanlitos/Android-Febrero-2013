package com.example.cambioactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText etxt;
	Bundle bundle;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button b = (Button)findViewById(R.id.cambiar);
        etxt = (EditText)findViewById(R.id.etx_enviar);
        bundle=new Bundle();
        b.setEnabled(false);
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//bundle.putString("key_texto", etxt.getText().toString());
				
				
				Intent i = new Intent(MainActivity.this, SegundaActividad.class);
				i.putExtra("clave_extra", "Texto obtenido del extra");
				i.putExtras(bundle);
				
				startActivity(i);
				finish();
			}
		});
        etxt.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
				bundle.putString("key_texto", etxt.getText().toString());
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				b.setEnabled(false);
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
			b.setEnabled(true);
			if ( etxt.getText().toString().equals("")) {
				b.setEnabled(false);
			}
			}
		});
        
    }

    
}
