package com.cav.m_tiba.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.cav.m_tiba.R;

import java.util.Date;

public class Profile extends AppCompatActivity {

    private EditText e_mail,mobile_number,username;
    private Date newdate;
    private Button register;
    private CheckBox terms;
    private RadioGroup radioSexGroup;
    private ProgressDialog progressDialog;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        radioSexGroup = (RadioGroup) findViewById(R.id.genderadio);
        e_mail = (EditText) findViewById(R.id.mail);
        register = (Button) findViewById(R.id.createlogin);
        mobile_number = (EditText) findViewById(R.id.phone_number);
        radioSexGroup = (RadioGroup) findViewById(R.id.genderadio);
        username = (EditText) findViewById(R.id.contact);
        progressDialog = new ProgressDialog(this);


    }
    public void terms_conditions(View view) {
        Intent intent = new Intent(Profile.this,Conditions.class);
        startActivity(intent);

    }

    public void newprofile(View view) {
        int getselectedid = radioSexGroup.getCheckedRadioButtonId();
        radioSexGroup = (RadioGroup) findViewById(getselectedid);
        String new_gender = radioSexGroup.toString();
        String phone_number = mobile_number.getText().toString().trim();
        String new_contact = username.getText().toString().trim();
        String new_mail = e_mail.getText().toString().trim();

        if (TextUtils.isEmpty(phone_number)){
            Toast.makeText(this,"Please enter your mobile number",Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(new_contact)){
            Toast.makeText(this,"Please Enter your username",Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(new_gender)){
            Toast.makeText(this,"Please choose your gender",Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(new_mail)){
            Toast.makeText(this,"Please enter your email",Toast.LENGTH_SHORT).show();
            return;
        }
        if (!new_mail.matches("[a-zA-Z0-9]+@[a-z]+.[a-z]{3}")){
            Toast.makeText(this,"That is not a valid email address",Toast.LENGTH_SHORT).show();
        }
        progressDialog.setMessage("Please wait while you get registerd.....");
        progressDialog.show();

    }
}
