package com.example.controles;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	TextView txto;
	ImageButton imgBtn;
	ToggleButton toggle;
	ImageView imagen;
	CheckBox checkbox;
	RadioGroup grupo;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txto = (TextView)findViewById(R.id.txv_texto);
        imgBtn = (ImageButton)findViewById(R.id.btn_image);
        toggle = (ToggleButton)findViewById(R.id.btn_toggle);
        
        imagen = (ImageView)findViewById(R.id.image);
        checkbox = (CheckBox)findViewById(R.id.btn_chkbx);
        grupo = (RadioGroup)findViewById(R.id.radioGroup);
        
        checkbox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					imagen.setImageResource(R.drawable.disc);
				}
				else
					imagen.setImageResource(R.drawable.volume);
			}
		});
        
        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
			txto.setText("Presionaste: "+checkedId);
			if (checkedId==R.id.rb_1) {
				txto.setBackgroundColor(Color.RED);
			}
			if (checkedId==R.id.rb_2) {
				txto.setBackgroundColor(Color.GREEN);
			}
			if (checkedId==R.id.rb_3) {
				txto.setBackgroundColor(Color.BLUE);
			}
			}
		});
        
        
        toggle.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					txto.setText("Encendido");
				}else
					txto.setText("Apagado");
			}
		});
        
        imgBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				txto.setText("Presionó la imagen");	
			}
		});
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
