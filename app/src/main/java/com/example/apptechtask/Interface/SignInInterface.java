package com.example.apptechtask.Interface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

public class SignInInterface {

    public static Signin_interface SignIN = null;

    public static Signin_interface getSignIN() {
        if (SignIN == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit.create(Signin_interface.class);
        }
        return SignIN;
    }

    interface Signin_interface {

    }

}
