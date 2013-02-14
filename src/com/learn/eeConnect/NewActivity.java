package com.learn.eeConnect;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;

import java.util.ArrayList;


public class NewActivity extends FragmentActivity implements AddSiteDialog.AddSiteDialogListener {

    ListView mSiteListView;
    ArrayList<String> siteList = new ArrayList<String>();
    CustomAdapter arrayAdapter = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_site);
        mSiteListView = (ListView) findViewById(R.id.siteAddList);
        arrayAdapter = new CustomAdapter();
        mSiteListView.setAdapter(arrayAdapter);

        Button b = (Button) findViewById(R.id.addSiteButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showDialog();
            }
        });
    }

    public void showDialog() {
        FragmentManager fm = getSupportFragmentManager();
        AddSiteDialog addSiteDialog = new AddSiteDialog();
        addSiteDialog.show(fm, "main");
    }

    public void onSignIn(String inputText) {
        siteList.add(inputText);
        arrayAdapter.notifyDataSetChanged();

    }

    class CustomAdapter extends ArrayAdapter<String> {
        CustomAdapter() {
            super(NewActivity.this, R.layout.add_site, siteList);
        }
        public View getView(int position, View convertView, ViewGroup parent){
            View row = convertView;

            if (row == null){
                LayoutInflater inflater = getLayoutInflater();
                row = inflater.inflate(R.layout.list_row, parent, false);
                Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down);
                row.startAnimation(animation);
            }

            ((TextView) row.findViewById(R.id.textViewId)).setText(siteList.get(position));


            return row;
        }
    }


}
