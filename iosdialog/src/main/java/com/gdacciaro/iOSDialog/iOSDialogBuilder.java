package com.gdacciaro.iOSDialog;
import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Gennaro Daniele Acciaro
 * http://gdacciaro.com
 * acciarogennaro@gmail.com
 * on 18/02/18.
 */

public class iOSDialogBuilder {
    private Typeface tf;
    private boolean bold;
    private String title, subtitle;
    private Context context;
    private iOSDialogClickListener listener;

    public iOSDialogBuilder(Context context) {
        this.context = context;
    }

    public iOSDialogBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public iOSDialogBuilder setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public iOSDialogBuilder setBoldPositiveLabel(boolean bold) {
        this.bold = bold;
        return this;
    }

    public iOSDialogBuilder setFont(Typeface font) {
        this.tf=font;
        return this;
    }

    public iOSDialogBuilder setOKClick(iOSDialogClickListener listener) {
        this.listener=listener;
        return this;
    }


    public iOSDialog build() {
        return new iOSDialog(context,title,subtitle, bold, tf,listener);
    }



}
