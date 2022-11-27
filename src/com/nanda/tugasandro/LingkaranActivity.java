package com.nanda.tugasandro;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends Activity {
	Button set;
	EditText jari;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lingkaran);
		jari = (EditText)findViewById(R.id.editText1);
		set = (Button)findViewById(R.id.button1);
		set.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				TextView hasil;
				String saya = jari.getText().toString();
				if(TextUtils.isEmpty(saya)) {
				    jari.setError("Jari Jari Di isi dulu!");
				    return;
				 }else{
					 double day=Integer.parseInt(saya),c=0;
					 double phi=3.14;
					 c=phi*day*day;
		                hasil = (TextView)findViewById(R.id.textView2);
		                hasil.setText(String.valueOf(c));
				 }
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lingkaran, menu);
		return true;
	}

}
