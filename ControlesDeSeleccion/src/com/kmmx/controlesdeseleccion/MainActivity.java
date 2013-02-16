package com.kmmx.controlesdeseleccion;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	final String[] arreglo = new String[] { "México", "Argelia", "Japón",
			"Argentina", "Uruguay" };
	
	
	ArrayList<String> datos = new ArrayList<String>();

	ArrayAdapter<String> adaptador;

	Spinner spiner;
	Button agregar;
	EditText nuevoDato;

	ListView lista;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spiner = (Spinner) findViewById(R.id.spiner);
		agregar = (Button) findViewById(R.id.agregar_btn);
		nuevoDato = (EditText) findViewById(R.id.editable);
		lista = (ListView) findViewById(R.id.lista);
		
		datos.add("Michoacan");
		datos.add("Morelos");
		datos.add("Morelia");
		// Forma 1 de instanciar la lista
		adaptador = new ArrayAdapter<String>(MainActivity.this,
				android.R.layout.simple_spinner_item, datos);
		/*
		 * ArrayAdapter<CharSequence> adaptador =
		 * ArrayAdapter.createFromResource(this, R.array.valores,
		 * android.R.layout.simple_spinner_item);
		 */

		adaptador.setDropDownViewResource(android.R.layout.simple_list_item_1);

		
		
		ArrayAdapter<String> adaptadorLista = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,datos);
		lista.setAdapter(adaptadorLista);
		
		
		
		
		
		
		spiner.setAdapter(adaptador);
		agregar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
					datos.add(nuevoDato.getText().toString());
					
					Toast.makeText(MainActivity.this, "Se ha añadido: "+nuevoDato.getText().toString()+" a la lista." ,Toast.LENGTH_SHORT).show();
					nuevoDato.setText("");
					spiner.setAdapter(adaptador);
				
			}
		});
		//Metodo para hacer click en los elementos de la lista 
		spiner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, datos.get(position),Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	

}
