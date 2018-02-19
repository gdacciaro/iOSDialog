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
    private iOSDialogClickListener positiveListener;
    private iOSDialogClickListener negativeListener;

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

    public iOSDialogBuilder setNegativeListener(iOSDialogClickListener listener) {
        this.negativeListener=listener;
        return this;
    }

    public iOSDialogBuilder setPositiveListener(iOSDialogClickListener listener) {
        this.positiveListener = listener;
        return this;
    }

    public iOSDialog build() throws Exception {
        iOSDialog dialog = new iOSDialog(context,title,subtitle, bold, tf);
        dialog.setNegativeListener(negativeListener);
        dialog.setPositiveListener(positiveListener);
        return dialog;
    }

}
