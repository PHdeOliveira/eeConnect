package com.learn.eeConnect;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.support.v4.app.DialogFragment;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class AddSiteDialog extends DialogFragment {








    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Rect displayRectangle = new Rect();
        Window window = getDialog().getWindow();


        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.getDecorView().getWindowVisibleDisplayFrame(displayRectangle);


        View view = inflater.inflate(R.layout.main, container, false);

        view.setMinimumWidth((int) (displayRectangle.width() * 0.86f));
        view.setMinimumHeight((int) (displayRectangle.height() * 0.88f));






        ((Button) view.findViewById(R.id.cancel_button)).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
            }
        });
        return view;

        //return inflater.inflate(R.layout.main, container, false);


    }



}