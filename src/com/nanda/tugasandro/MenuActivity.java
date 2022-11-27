package com.nanda.tugasandro;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView.HitTestResult;
import android.widget.Button;

public class MenuActivity extends Activity {
	
	Button pindah,pindah2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        
        pindah = (Button)findViewById(R.id.btn_sewa);
        pindah.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent toDua = new Intent(MenuActivity.this,SewaActivity.class);
				startActivity(toDua);
			}
		});
        
        pindah2 = (Button)findViewById(R.id.btn_hitung);
        pindah2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent toTiga = new Intent(MenuActivity.this,LingkaranActivity.class);
				startActivity(toTiga);
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    
}
