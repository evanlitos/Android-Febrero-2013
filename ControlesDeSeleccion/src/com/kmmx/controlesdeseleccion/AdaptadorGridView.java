package com.kmmx.controlesdeseleccion;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class AdaptadorGridView extends BaseAdapter {

	private Context context;
	public AdaptadorGridView(Context context) {
		// TODO Auto-generated constructor stub
		this.context= context;
	}
	
	public Integer[] miniaturas = {
			R.drawable.pic_1,R.drawable.pic_2,
			R.drawable.pic_3,R.drawable.pic_4,
			R.drawable.pic_5,R.drawable.pic_6,
			R.drawable.pic_7,R.drawable.pic_8,
			R.drawable.pic_9,R.drawable.pic_10,
			R.drawable.pic_11,R.drawable.pic_12,
			R.drawable.pic_13,R.drawable.pic_14,
			R.drawable.pic_15
			
	};
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return miniaturas.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return miniaturas[position];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View v, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imagen = new ImageView(context);
		imagen.setImageResource(miniaturas[position]);
		imagen.setScaleType(ImageView.ScaleType.CENTER_CROP);
		imagen.setLayoutParams(new GridView.LayoutParams(70,70));
		return imagen;
	}

}
