package com.example.retrochat.providers;

import com.example.retrochat.models.FCMBody;
import com.example.retrochat.models.FCMResponse;
import com.example.retrochat.retrofit.IFCMApi;
import com.example.retrochat.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {

    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClient(url).create(IFCMApi.class).send(body);
    }

}
