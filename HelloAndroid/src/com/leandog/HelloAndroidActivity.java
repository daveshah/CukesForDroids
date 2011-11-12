package com.leandog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HelloAndroidActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button = (Button) findViewById(R.id.click_me_button);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView textView = (TextView)findViewById(R.id.text_view);
				textView.setText(R.string.clicked_text);
			}
		});
    }
}