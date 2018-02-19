package com.gdacciaro.iOSDialogDemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        final iOSDialog iOSDialog =  new iOSDialogBuilder(MainActivity.this)
                .setTitle(getString(R.string.example_title))
                .setSubtitle(getString(R.string.example_subtitle))
                .setBoldPositiveLabel(true)
                .setOKClick(new iOSDialogClickListener() {
                    @Override
                    public void onClick(iOSDialog dialog) {
                        dialog.dismiss();
                    }
                })
                .setFont(null)  //add your typeface!
                .build();

        iOSDialog.setPositiveListener(getString(R.string.ok),new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"OK clicked",Toast.LENGTH_SHORT).show();
                iOSDialog.dismiss();
            }
        });
        iOSDialog.setNegativeListener(getString(R.string.dismiss),new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iOSDialog.dismiss();
            }
        });
        iOSDialog.show();

    }


}
