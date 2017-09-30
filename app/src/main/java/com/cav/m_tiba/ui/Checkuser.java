package com.cav.m_tiba.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.cav.m_tiba.R;
import com.cav.m_tiba.services.AccountService;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import butterknife.Bind;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import static android.R.attr.phoneNumber;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Checkuser extends AppCompatActivity  {

    @Bind(R.id.submit_number) Button mSubmit_number;
    @Bind(R.id.new_number) EditText mNew_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkuser_activity);
    }

//    @Override
//    public void onClick(View view) {
//        AccountService  accountService = new AccountService();
//        if (view == mSubmit_number){
//            String phoneNumber = mNew_number.getText().toString().trim();
//            AccountService.checkUser(phoneNumber, new Callback() {
//                @Override
//                public void onFailure(Call call, IOException e) {
//                    //Something went wrong do something
//                }
//
//                @Override
//                public void onResponse(Call call, Response response) throws IOException {
//                    try{
//                        String jsonData = response.body().string();
//                        if (response.isSuccessful()){
//                            JSONObject userObject = new JSONObject(jsonData);
//                            boolean hasPassword = userObject.getBoolean("hasPassword");
//                            if (!hasPassword){
//                                Intent intent = new Intent(getApplicationContext(), Profile.class);
//                                String phoneNumber = mNew_number.getText().toString().trim();
//                                intent.putExtra("phoneNumber",phoneNumber);
//                                startActivity(intent);
//                                finish();
//                            }else{
//                                Intent intent = new Intent(getApplicationContext(), HamburgerMenuActivity.class);
//                                String phoneNumber = mNew_number.getText().toString().trim();
//                                intent.putExtra("phoneNumber",phoneNumber);
//                                startActivity(intent);
//                            }
//                        }
//                    }catch (IOException e) {
//                        e.printStackTrace();
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }
//    }

    public void enternumber(View view) {

//        String phoneNumber = mNew_number.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), Profile.class);
//        intent.putExtra("phoneNumber",phoneNumber);phoneNumber
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    public void user_logout(){
        startActivity(new Intent(this,Login.class));
        finish();
    }
    public void go_profile(){
        startActivity(new Intent(this,Profile.class));
    }
    public void new_policy(){
        finish();
        startActivity(new Intent(this,Conditions.class));
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){

            case R.id.new_logout:
                user_logout();
                return true;

            case R.id.new_profile:
                go_profile();
                return true;

            case R.id.new_privacy:
                new_policy();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }



}


