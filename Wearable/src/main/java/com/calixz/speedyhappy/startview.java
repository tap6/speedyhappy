package com.calixz.speedyhappy;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;

public class startview extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_Black);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.startview);
		
		new Handler().postDelayed(new Runnable() {
				@Override
				public void run() {
					Intent intent = new Intent(startview.this, main.class);//设置调转页面
					startActivity(intent);//跳转
					finish();//销毁当前页面
				}
			}, 1000);
    }
}
