package com.learn.eeConnect;


import android.graphics.Rect;
import android.os.Bundle;
import android.view.*;
import android.support.v4.app.DialogFragment;
import android.view.View.OnClickListener;
import android.widget.*;

import java.util.ArrayList;


public class AddSiteDialog extends DialogFragment {


    public interface AddSiteDialogListener {
        void onSignIn(String inputText);

    }

    private  EditText editText;

    public AddSiteDialog() {
        //Empty constructor
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

        editText = (EditText) view.findViewById(R.id.siteEditText);

        editText.setHint("Enter URL");

        editText.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setCursorVisible(true);
                editText.setHint("");
               }
        });

        ((Button) view.findViewById(R.id.sign_in_button)).setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                AddSiteDialogListener activity = (AddSiteDialogListener) getActivity();
                activity.onSignIn(editText.getText().toString());
                Toast.makeText(getActivity(), "Site Added", Toast.LENGTH_LONG).show();
                getDialog().dismiss();

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