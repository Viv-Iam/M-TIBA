package com.cav.m_tiba.services;

import android.util.Log;

import com.cav.m_tiba.model.Account;
import com.cav.m_tiba.Constants;

import org.json.JSONObject;

import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by wasike on 29/09/17.
 */

public class AccountService {
    public static void findTills(String till, Callback callback){
        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.MTIBA_BASE_URL).newBuilder();

        urlBuilder.addQueryParameter(Constants.MTIBA_TILL_KEY,till);

        String url =urlBuilder.build().toString();

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("Authorization", Constants.MTIBA_TOKEN)
                .url(url)
                .build();
        Log.v("Information", url);


        Call call = client.newCall(request);
        call.enqueue(callback);
    }

//    public ArrayList<Account> processResult(Response response) {
//        ArrayList<Account> accounts = new ArrayList<>();
//
//        try{
//            String jsonData = response.body().string();
//            if (response.isSuccessful()){
//                JSONObject mtibaJSON = new JSONObject(jsonData);
//            }
//        }
//    }


}
