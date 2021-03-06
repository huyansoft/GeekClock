package edu.crabium.android.geekclock;

import edu.crabium.android.geekclock.R;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AboutActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		LinearLayout layout = (LinearLayout) findViewById(R.id.LinearLayout);
		layout.setBackgroundColor(Color.BLACK);

		TextView aboutActivityText = (TextView) findViewById(R.id.aboutText);
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		if (dm.heightPixels > 600) {
			aboutActivityText
					.setText("\n\t\t\t\t    Geek Clock  Version 2.3\n"
							+ "\t\t\t\t   Released at 19 Oct 2011 \n"
							+ "\t\t\t\t   Updated  at 06 Mar 2012 \n\n\n"
							+ "\t\t\t 作者：\n"
							+ "\t\t\t 李伟:\n\t\t\t\t\thttp://mindlee.net\n"
							+ "\t\t\t\t\tchinawelon@gmail.com\n"
							+ "\t\t\t 吴旭东:\n\t\t\t\t\thttp://tikiet.blog.163.com\n"
							+ "\t\t\t\t\twuxd@me.com\n\n\n"
							+ "\t\t\t\t\tCrabium & Mabbage Workshop\n\t\t\t\t\t\t\t\tLiWei and WuXudong\n\t\t\t\t\t\t\t\t\t\tCopyleft 2011.");
		} else {
			aboutActivityText
					.setText("\n\n\t\t\t    Geek Clock  Version 2.3\n"
							+ "\t\t\t   Released at 19 Oct 2011 \n"
							+ "\t\t\t   Updated  at 06 Mar 2012 \n\n\n"
							+ "\t\t\t 作者：\n"
							+ "\t\t\t 李伟:\n\t\t\t\t\thttp://mindlee.net\n"
							+ "\t\t\t\t\tchinawelon@gmail.com\n"
							+ "\t\t\t 吴旭东:\n\t\t\t\t\thttp://tikiet.blog.163.com\n"
							+ "\t\t\t\t\twuxd@me.com\n\n\n"
							+ "\t\t\tCrabium & Mabbage Workshop\n\t\t\t\t  LiWei and WuXudong\n\t\t\t\t\t\tCopyleft 2011.");
		}

		Button backButton = (Button) findViewById(R.id.backButton);
		backButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				AboutActivity.this.finish();
			}
		});
	}

}