package com.onquantum.rockstarfree.activities;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.onquantum.rockstarfree.R;


/**
 * Created by saiber on 04.03.14.
 */
public class AboutActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/BaroqueScript.ttf");
        ((TextView)this.findViewById(R.id.textView)).setTypeface(typeface);
    }
}
