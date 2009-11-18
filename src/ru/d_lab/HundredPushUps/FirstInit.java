package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstInit extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.firstinit);

Button mFirstRunOk = (Button)findViewById(R.id.FirstRunOk);
mFirstRunOk.setOnClickListener(this);
}
	public void onClick(View v)
    {
		Intent intent = new Intent();
        intent.setClass(this, FirstInitInit.class);
        startActivity(intent);
    }
}
