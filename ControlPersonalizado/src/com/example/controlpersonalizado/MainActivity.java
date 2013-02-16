package com.example.controlpersonalizado;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	TextView etiqueta;
	ListView lista;
	private Tweet[] datos= new Tweet[]{
			new Tweet("Pepe", "Texto 1"),
			new Tweet("Hugo", "Texto 2"),
			new Tweet("Paco", "Texto 3"),
			new Tweet("Luis", "Texto 4"),
			
	};
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etiqueta = (TextView)findViewById(R.id.textView);
        lista= (ListView)findViewById(R.id.listaPerson);
        
        AdaptadorDeTweets adaptador = new AdaptadorDeTweets(this);
        lista.setAdapter(adaptador);
        
    }

class AdaptadorDeTweets extends ArrayAdapter<Tweet>{

	Activity context;
	public AdaptadorDeTweets(Activity context) {
		super(context, R.layout.item_tweet,datos);
		this.context=context;
		// 
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = context.getLayoutInflater();
		View item = inflater.inflate(R.layout.item_tweet,null);
		
		TextView nombre_lbl= (TextView)item.findViewById(R.id.tv_Nombre);
		nombre_lbl.setText(datos[position].getNombre());

		TextView texto= (TextView)item.findViewById(R.id.tv_Texto);
		texto.setText(datos[position].getTexto());
		
		
		return (item);
	}
	
	
	
}
    
}




