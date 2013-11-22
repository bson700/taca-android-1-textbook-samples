package com.example.checkdir;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView textView01 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView01 = (TextView) findViewById(R.id.tv_working_dir);
		textView01.setText(getApplicationInfo().dataDir);

	}

}
