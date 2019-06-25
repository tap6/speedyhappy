package com.calixz.speedyhappy;
import android.app.*;
import android.os.*;
import android.media.*;
import android.widget.*;
import android.content.*;
import android.view.*;

public class main extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void div(View imgbt){ //div -Diversion
		switch(imgbt.getId()){
			case R.id.mainImageButton_qsbk:
				jump2window(qsbk.class);break;
			case R.id.mainImageButton_bsbdj:
				jump2window(bsbdj.class);break;
			case R.id.mainImageButton_zy:
				jump2window(zy.class);break;
			case R.id.mainImageButton_setting:
				jump2window(setting.class);break;
		}
	}
	
	public void jump2window(Class target){
		Intent intent=new Intent(this,target);
		startActivity(intent);
	}
}
