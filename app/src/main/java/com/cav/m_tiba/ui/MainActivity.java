package com.cav.m_tiba.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.BinderThread;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.cav.m_tiba.R;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.cav.m_tiba.R.id.tillEditText;

/**
 * Created by wasike on 29/09/17.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.findTillButton) Button mFindTillButton;
    @Bind(tillEditText) EditText mTillEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindTillButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.v("click", "click");
        if(view == mFindTillButton) {
            String till = mTillEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, HamburgerMenuActivity.class);
            intent.putExtra("till", till);
            startActivity(intent);
        }

    }
}
