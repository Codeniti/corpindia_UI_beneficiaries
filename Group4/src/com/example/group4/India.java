package com.example.group4;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.*;
public class India extends Activity  {
     Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);
        b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() 
			 {
				 public void onClick(View v) {
	
	
	Intent i=new Intent(India.this,MainActivity.class);
	
	startActivity(i);

}
    });
}
			
     public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.india, menu);
        return true;
    
       
			 
			 }}



    