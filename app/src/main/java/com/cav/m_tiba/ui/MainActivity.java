package com.cav.m_tiba.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.BinderThread;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.cav.m_tiba.R;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by wasike on 29/09/17.
 */

public class MainActivity extends AppCompatActivity{

public static int time_out = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Checkuser.class);
                startActivity(intent);

                finish();
            }
        }, time_out);

    }
}
