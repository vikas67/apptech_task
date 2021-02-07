package com.example.apptechtask.Interface;

import com.example.apptechtask.Other.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class SignInInterface {

    public static Signin_interface SignIN = null;

    public static Signin_interface getSignIN() {
        if (SignIN == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit.create(Signin_interface.class);
        }
        return SignIN;
    }

    interface Signin_interface {
//        @FormUrlEncoded
//        @POST("test_user_login")
//        Call<> getResponse(
//                @Field("number") String number
//        );
    }

}
