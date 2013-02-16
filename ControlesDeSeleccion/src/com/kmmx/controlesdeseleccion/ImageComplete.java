package com.kmmx.controlesdeseleccion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class ImageComplete extends Activity{
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.image_complete);
	
	Intent b = getIntent();
	
	
	AdaptadorGridView imageAdapter = new AdaptadorGridView(this);
	ImageButton imb=(ImageButton)findViewById(R.id.complete_image);
	imb.setImageResource(imageAdapter.miniaturas[b.getExtras().getInt("pasar_imagen")]);
	imb.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		finish();	
		}
	});
}
}
