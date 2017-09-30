package com.cav.m_tiba.services;

import android.content.SharedPreferences;
import android.util.Log;

import com.cav.m_tiba.model.Account;
import com.cav.m_tiba.Constants;

import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.Gson;


import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by wasike on 29/09/17.
 */

public class AccountService {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;


    //check user
    public static void checkUser(String phoneNumber, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        String url= Constants.BASE_URL+Constants.MTIBA_CHECK_USER+phoneNumber;
        Request request = new Request.Builder()
                .header("Authorization", Constants.MTIBA_TOKEN)
                .url(url)
                .build();

        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    public void createNewAccount(Account accountHolder, Callback callback){

        Gson gson = new Gson();
        String json = gson.toJson(accountHolder);

//        JSONObject json2 = new JSONObject(jsonidentification);
        String url = "http://program-service-test.ap-southeast-1.elasticbeanstalk.com/accountholders";
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, json.toString());
        Request request = new Request.Builder()
                .header("Authorization", Constants.MTIBA_TOKEN)
                .header("Accept","*/*")
                .url(url)
                .method("POST", body)
                .build();
        Call call = client.newCall(request);
        call.enqueue(callback);


    }



    //put request for confirming password
    public void createNewPassword(String phoneNumber, String password, Callback callback){
        JSONObject jsonObject = new JSONObject();
        try{
            jsonObject.put(Constants.MTIBA_USERNAME_KEY, phoneNumber);
            jsonObject.put(Constants.MTIBA_PASSWORD, "");
            jsonObject.put(Constants.MTIBA_NEW_PASSWORD, password);
        }catch (JSONException e) {
            e.printStackTrace();
        }

        String url = Constants.MTIBA_BASE_URL+Constants.MTIBA_CREATE_PASSWORD;

        MediaType JSON = MediaType.parse("application/json; charset=ut-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, jsonObject.toString());
        Request request = new Request.Builder()
                .header("Authorization", Constants.MTIBA_TOKEN)
                .header("Accept","*/*")
                .url(url)
                .method("POST", body)
                .build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    public void login(String username, String password, Callback callback){
        JSONObject json = new JSONObject();
        try{
            json.put(Constants.MTIBA_USERNAME_KEY,username);
            json.put(Constants.MTIBA_PASSWORD, password);
        }catch (JSONException e){
            e.printStackTrace();
        }
        String url = Constants.MTIBA_BASE_URL+Constants.MTIBA_LOGIN;
        RequestBody body = RequestBody.create(JSON, json.toString());
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("Authorization", Constants.MTIBA_TOKEN)
                .header("Accept","*/*")
                .url(url)
                .method("POST", body)
                .build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }



}