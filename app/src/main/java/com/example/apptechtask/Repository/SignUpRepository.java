package com.example.apptechtask.Repository;

import android.content.Context;

public class SignUpRepository {


    public static SignUpRepository ourInstance;

    public SignUpRepository(Context context) {
    }

    public static SignUpRepository getInstance(Context context) {
        return ourInstance = new SignUpRepository(context);
    }

}
