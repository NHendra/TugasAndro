package com.nanda.tugasandro;


import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SewaActivity extends Activity {
	Button set;
	EditText hari;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sewa);
		hari = (EditText)findViewById(R.id.editText1);
		final RadioGroup tipe = (RadioGroup)findViewById(R.id.radioGroup1);
		set = (Button)findViewById(R.id.button1);
		set.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				TextView hasil;
				String saya = hari.getText().toString();
				int price=0;
				if(TextUtils.isEmpty(saya)) {
				    hari.setError("Di isi dulu!");
				    return;
				 }else{
				
				int id = tipe.getCheckedRadioButtonId();
                switch (id){
                    case R.id.radio0 :
                    	price=100000;
                        break;
                    case R.id.radio1 :
                    	price=150000;
                        break;
                    case R.id.radio2 :
                    	price=400000;
                        break;
			}
                int day=Integer.parseInt(saya),c=day*price;
                hasil = (TextView)findViewById(R.id.textView1);
                hasil.setText(String.valueOf(c));
				 }
           }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sewa, menu);
		return true;
	}

}
