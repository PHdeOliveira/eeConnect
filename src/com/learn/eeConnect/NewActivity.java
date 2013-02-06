package com.learn.eeConnect;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;


public class NewActivity extends FragmentActivity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  
        setContentView(R.layout.add_site);

        Button b = (Button) findViewById(R.id.addSiteButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });



    }

    public void showDialog() {
        DialogFragment newFragment = new AddSiteDialog();
        newFragment.show(getSupportFragmentManager(), "Dialog");



    }

}
