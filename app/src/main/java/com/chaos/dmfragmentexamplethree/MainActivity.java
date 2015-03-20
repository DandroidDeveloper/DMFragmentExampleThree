package com.chaos.dmfragmentexamplethree;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View v) {
        TextView lbl = (TextView)
                findViewById(R.id.lblFragment1);
        Toast.makeText(this, lbl.getText(),
                Toast.LENGTH_SHORT).show();
    }

}