package com.learn.eeConnect;


import android.graphics.Rect;
import android.os.Bundle;
import android.view.*;
import android.support.v4.app.DialogFragment;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;

import java.util.ArrayList;


public class AddSiteDialog extends DialogFragment {

    AddSiteClick aCallback;

    public interface AddSiteClick {
        public void onSignIn(DialogFragment dialog);

    }


    public void onAttach(NewActivity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            aCallback = (AddSiteClick) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Rect displayRectangle = new Rect();
        Window window = getDialog().getWindow();

        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.getDecorView().getWindowVisibleDisplayFrame(displayRectangle);

        LayoutInflater layoutInflater = getActivity().getLayoutInflater();

        final View view;
        view = layoutInflater.inflate(R.layout.main, null);

        view.setMinimumWidth((int) (displayRectangle.width() * 0.95f));
        view.setMinimumHeight((int) (displayRectangle.height() * 0.88f));

        final EditText editText = (EditText) view.findViewById(R.id.siteEditText);

        editText.setHint("Enter URL");

        editText.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setCursorVisible(true);
                editText.setHint("");
               }

        });

        ((Button) view.findViewById(R.id.sign_in_button)).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                aCallback.onSignIn(AddSiteDialog.this);




            }
        });



        ((Button) view.findViewById(R.id.cancel_button)).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();

            }
        });
        return view;
    }



}