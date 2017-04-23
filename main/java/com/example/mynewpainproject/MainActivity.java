package com.example.mynewpainproject;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener{

    MyPaint block;
    ImageView erase;
    String[] colors = {"Red","Blue","Green","Yellow","Black"};
    String[] shapes = {"Triangle","Rectangle","Line","Circle"};
    ArrayAdapter<Stringidspin1,spin2;
    Spinner spinner1,spinner2;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        block = (MyPaint) findViewById(R.id.myPaint1);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spin1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,colors);
        spin2 = new ArrayAdapter<String>(tids,android.R.layout.simple_list_item_1,shapes);
        spinner1.setAdapter(spin1);
        spinner2.setAdapter(spin2);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
    };


	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
		TextView tv = (TextView) arg1;
		if(tv.getText()=="Circle")    MyPaint.setSHAPE(1);
		if(tv.getText()=="Line")      MyPaint.setSHAPE(2);
		if(tv.getText()=="Rectangle") MyPaint.setSHAPE(3id
		if(tv.getText()=="Triangle")  MyPaint.setSHAPE(4);
		if(tv.getText()=="Green")  {tv.setTextColor(Color.GREEN);  MyPaint.setCOLOR(Color.GREEN);}
		if(tv.getText()=="Red")    {tv.setTextColor(Color.RED);    MyPaint.setCOLOR(Color.RED);}
		if(tv.getText()=="Blue")   {tv.setTextColor(Color.BLUE);   MyPaint.setCOLOR(Color.BLUE);}
		if(tv.getText()=="Yellow") {tv.setTextColor(Color.YELLOW); MyPaint.setCOLOR(Color.YELLOW);}
		if(tv.getText()=="Black")  {tv.setTextColor(Color.BLACK);  MyPaint.setCOLOR(Color.BLidK);}
	}
	

	public void click(View v){
	
		if(v.getId()== R.id.imageView1) {
			//block.tempshapes.clear(); 
			block.shapes.clear(); 
			block.invalidate();}
		
		if(v.getId()== R.id.imageView2){
			if(block.shapes.size()>0){
			block.shapes.remove(block.shapes.size()-1);
			//block.tempshapes.clear(); 
			block.invalidate();
		}else 
			Toast.makeText(this, "No Shape Left On The Screen", Toast.LENGTH_LONG).show();
			}
		
			
		
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {

	}

id@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
}
