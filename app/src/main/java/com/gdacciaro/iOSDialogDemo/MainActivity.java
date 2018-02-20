package com.gdacciaro.iOSDialogDemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.gdacciaro.iOSDialog.iOSDialog;
import com.gdacciaro.iOSDialog.iOSDialogBuilder;
import com.gdacciaro.iOSDialog.iOSDialogClickListener;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new iOSDialogBuilder(MainActivity.this)
                .setTitle(getString(R.string.example_title))
                .setSubtitle(getString(R.string.example_subtitle))
                .setBoldPositiveLabel(true)
                .setCancelable(false)
                .setPositiveListener(getString(R.string.ok),new iOSDialogClickListener() {
                    @Override
                    public void onClick(iOSDialog dialog) {
                        Toast.makeText(MainActivity.this,"Clicked!",Toast.LENGTH_LONG).show();
                        dialog.dismiss();

                    }
                })
                .setNegativeListener(getString(R.string.dismiss), new iOSDialogClickListener() {
                    @Override
                    public void onClick(iOSDialog dialog) {
                        dialog.dismiss();
                    }
                })
                .build().show();
    }


}
