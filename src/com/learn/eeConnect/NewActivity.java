package com.learn.eeConnect;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
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
        //final String string  = getString(R.string.listString);

        mSiteListView = (ListView) findViewById(R.id.siteAddList);
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_row, R.id.textViewId, siteList);
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
            }

            ((TextView) row.findViewById(R.id.textViewId)).setText(siteList.get(position));

            return (row);
        }
    }
}
