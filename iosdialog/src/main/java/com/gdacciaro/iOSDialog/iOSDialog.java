package com.gdacciaro.iOSDialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Gennaro Daniele Acciaro
 * http://gdacciaro.com
 * acciarogennaro@gmail.com
 * on 04/09/17.
 */

public class iOSDialog {
    private Dialog dialog;
    private TextView dialogButtonOk ,dialogButtonNo;
    private TextView title_lbl, subtitle_lbl;
    private View separator;
    private boolean negativeExist = false;

    public iOSDialog(Context context) {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.alerts_two_buttons);
        if(dialog.getWindow()!=null)
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        initViews();
    }


    public void setPositiveListener(View.OnClickListener okListener){
        dialogButtonOk.setOnClickListener(okListener);
    }
    public void setNegativeListener(View.OnClickListener okListener){
        if(!negativeExist){
            Log.e("iOSDialog","!!! Negative button isn't visible, set it with setNegativeLabel()!!!");
        }
        dialogButtonNo.setOnClickListener(okListener);
    }

    public void show(){
        if(!negativeExist){
            dialogButtonNo.setVisibility(View.GONE);
            separator.setVisibility(View.GONE);
        }
        dialog.show();
    }

    public void dismiss(){
        dialog.dismiss();
    }

    public void setTitle(String title){
        title_lbl.setText(title);
    }
    public void setSubtitle(String subtitle){
        subtitle_lbl.setText(subtitle);
    }

    public void setPositiveLabel(String positive){
        dialogButtonOk.setText(positive);
    }
    public void setNegativeLabel(String negative){
        negativeExist=true;
        dialogButtonNo.setText(negative);
    }
    public void setBoldPositiveLabel(boolean bold){
        if(bold)
            dialogButtonOk.setTypeface(null, Typeface.BOLD);
        else
            dialogButtonOk.setTypeface(null, Typeface.NORMAL);
    }

    private void initViews() {
        title_lbl = (TextView) dialog.findViewById(R.id.title);
        subtitle_lbl = (TextView) dialog.findViewById(R.id.subtitle);
        dialogButtonOk = (TextView) dialog.findViewById(R.id.dialogButtonOK);
        dialogButtonNo = (TextView) dialog.findViewById(R.id.dialogButtonNO);
        separator = (View) dialog.findViewById(R.id.separator);
    }

}

/*
 *  Made with love (and coffee) in Naples, Italy!
 *
 *  __
 * // ""--.._
 * ||  (_)  _ "-._
 * ||    _ (_)    '-.
 * ||   (_)   __..-'
 * \\__..--""
 *
 */