package com.kmmx.controlesdeseleccion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewExample extends Activity{

 String[] palabras = new String[]{
		 "uno","dos","tres",
		 "cuatro","cinco","seis",
		 "siete","ocho","nueve",
		 "dies","once","doce",
		 "trece","catorce","quince"
		 
 };
	GridView grid;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_layout);
		
		grid=(GridView)findViewById(R.id.grid_view);
		
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>
		(this, android.R.layout.simple_list_item_1,palabras);
		
		grid.setAdapter(new AdaptadorGridView(this));
	
		grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),""+v.getId()+"" ,Toast.LENGTH_SHORT).show();
				startActivity(new Intent(GridViewExample.this, ImageComplete.class).putExtra("pasar_imagen",position));
				
				
			}
		});
		
	}
	
}
