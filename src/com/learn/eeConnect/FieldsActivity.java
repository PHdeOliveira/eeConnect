//package com.learn.eeConnect;
//
//import android.app.Activity;
//import android.app.AlertDialog;
//import android.app.Dialog;
//import android.content.Context;
//import android.content.DialogInterface;
//import android.os.Bundle;
//import android.os.Parcelable;
//import android.support.v4.view.PagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.widget.*;
//import android.app.DialogFragment;
//import android.support.v4.app.FragmentActivity;
//import android.support.v4.app.FragmentPagerAdapter;
//import android.support.v4.app.FragmentStatePagerAdapter;
//
//import java.util.ArrayList;
//
//
//public class FieldsActivity extends Activity {
//
//    ImageButton settingsButton;
//
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.fields);
//
//        MyPagerAdapter adapter = new MyPagerAdapter();
//        final ViewPager mPager = (ViewPager) findViewById(R.id.fieldspager);
//
//        mPager.setPageMargin(5);
//        mPager.setPageMarginDrawable(R.drawable.viewpagerdivider);
//        mPager.setAdapter(adapter);
//        mPager.setCurrentItem(1);
//
//        settingsButton = (ImageButton) findViewById(R.id.settingsButton);
//        settingsButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                int currentpage = mPager.getCurrentItem();
//                switch(currentpage){
//
//                    case 0:
//                        mPager.setCurrentItem(1, true);
//                        break;
//                    case 1:
//                        mPager.setCurrentItem(0, true);
//                        break;
//                    case 2:
//                        mPager.setCurrentItem(0, true);
//                        break;
//                }
//
//            }
//        });
//
//    }
//
//    private class MyPagerAdapter extends PagerAdapter {
//
//
////    private class MyPagerAdapter extends PagerAdapter   {
//
//        final ViewPager mPager = (ViewPager) findViewById(R.id.fieldspager);
//
//
//
//        public int getCount() {
//            return 3;
//        }
//
//        public Object getItem(View collection, int position) {
//
//            LayoutInflater inflater = (LayoutInflater) collection.getContext()
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//            ListView lv = (ListView)findViewById(android.R.id.list);
//
//            final ArrayList<String> siteList = new ArrayList<String>();
//            final ArrayAdapter<String> aa;
//            aa = new ArrayAdapter<String>(getBaseContext(), R.layout.list_row, siteList);
//
//
//            if (lv != null) {
//                lv.setAdapter(aa);
//            }
//
//
//            int resId = 0;
//
//            View view = null;
//            switch (position) {
//                case 0:
//                    resId = R.layout.field01;
//                    view = inflater.inflate(resId, null);
//                    ((ViewPager) collection).addView(view, 0);
//
//                    return view;
//
//                case 1:
//                    resId = R.layout.add_site;
//                    view = inflater.inflate(resId, null);
//                    Button addSiteButton = (Button)view.findViewById(R.id.addSiteButton);
//                    ((ViewPager) collection).addView(view, 0);
//                    addSiteButton.setOnClickListener(new View.OnClickListener() {
//
//                        @Override
//                        public void onClick(View v) {
//                            DialogFragment addSiteFragment = new AddSiteDialog();
//                            addSiteFragment.getDialog();
//
//                        }
//
//                    });
//
//
//
//
//
//
//
//                    return view;
//
//                case 2:
//                    resId = R.layout.main;
//                    view = inflater.inflate(resId, null);
//                    Button signInButton = (Button)view.findViewById(R.id.sign_in_button);
//                    final EditText editText = (EditText)view.findViewById(R.id.textViewId);
//                    ((ViewPager) collection).addView(view, 0);
//                    signInButton.setOnClickListener(new View.OnClickListener() {
//
//                        @Override
//                        public void onClick(View v) {
//
//                            siteList.add(0, editText.getText().toString());
//                            aa.notifyDataSetChanged();
//                            editText.setText("");
//                            mPager.setCurrentItem(1, true);
//                        }
//
//                    });
//                    return view;
//            }
//
//            return view;
//        }
//
//
//
//
//        @Override
//        public void destroyItem(View arg0, int arg1, Object arg2) {
//            ((ViewPager) arg0).removeView((View) arg2);
//
//        }
//
//        @Override
//        public void finishUpdate(View arg0) {
//            // TODO Auto-generated method stub
//
//        }
//
//        @Override
//        public boolean isViewFromObject(View arg0, Object arg1) {
//            return arg0 == ((View) arg1);
//
//        }
//
//        @Override
//        public void restoreState(Parcelable arg0, ClassLoader arg1) {
//            // TODO Auto-generated method stub
//
//        }
//
//        @Override
//        public Parcelable saveState() {
//            // TODO Auto-generated method stub
//            return null;
//        }
//
//        @Override
//        public void startUpdate(View arg0) {
//            // TODO Auto-generated method stub
//
//        }
//
//    }
//
//
//
//
//
//
//
//
//
//}
//
//
//
//
