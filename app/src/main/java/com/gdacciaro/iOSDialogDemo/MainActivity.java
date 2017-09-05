package com.gdacciaro.iOSDialogDemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.gdacciaro.iOSDialog.iOSDialog;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final iOSDialog iOSDialog = new iOSDialog(MainActivity.this);
        iOSDialog.setTitle( "Allow \"Calendar\" to access your location while you use the app?");
        iOSDialog.setSubtitle("Your location is used to estimate travel times to events and improve location searches");
        iOSDialog.setNegativeLabel("Don't Allow");
        iOSDialog.setPositiveLabel("Allow");
        iOSDialog.setBoldPositiveLabel(true);
        iOSDialog.setNegativeListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iOSDialog.dismiss();
            }
        });
        iOSDialog.setPositiveListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"OK clicked",Toast.LENGTH_SHORT).show();
                iOSDialog.dismiss();
            }
        });
        iOSDialog.show();
    }


}
