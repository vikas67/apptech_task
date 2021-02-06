package com.example.apptechtask.Interface;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class SignupInterface {
    public static final SignUp Signup = null;

    public static SignUp getSignup() {
        if (Signup == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit.create(SignUp.class);
        }
        return Signup;
    }

    interface SignUp {
//        @FormUrlEncoded
//        @POST("a")
//        Call<> getResponse(
//                @Field("number") String number
//        );
    }
}
