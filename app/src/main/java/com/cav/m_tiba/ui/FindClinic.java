package com.cav.m_tiba.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cav.m_tiba.R;

public class FindClinic extends AppCompatActivity {
    Button btn;
    TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_clinic);
        btn = (Button) findViewById(R.id.btn);
        data = (TextView) findViewById(R.id.data);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {


            }
        });
    }
}
