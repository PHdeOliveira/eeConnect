package com.learn.eeConnect;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Transformation;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;

import java.util.ArrayList;


public class NewActivity extends FragmentActivity implements AddSiteDialog.AddSiteClick {

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

        ListView siteListView = (ListView) findViewById(R.id.siteList);


    }

    public void showDialog() {

        DialogFragment newFragment = new AddSiteDialog();
        newFragment.show(getSupportFragmentManager(), "Dialog");

    }

    public void onSignIn(DialogFragment dialog) {






    }

}
