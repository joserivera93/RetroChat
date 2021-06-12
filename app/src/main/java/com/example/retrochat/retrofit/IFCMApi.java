package com.example.retrochat.retrofit;

import com.example.retrochat.models.FCMBody;
import com.example.retrochat.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAATGzBAtk:APA91bFAlfmlwpZnIf4bUqBeIRuxEsX_B1RWBU15el7Iy0rrxwccnuRr9rfAbP0L2_qnxPiPjWWtaPgJu1vitrVmX3MYIREnEeKn55SD051OtBOTfszdbTHEAZFobdIVL9GQaLX8PWle"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);
}
