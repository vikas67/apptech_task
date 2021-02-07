package com.example.apptechtask.Repository;

import android.content.Context;
import android.util.Log;

public class SigninRepository {

    public static SigninRepository ourInstance;
    private static final String TAG = "SigninRepository";

    public SigninRepository(Context context) {
    }

    public static SigninRepository getInstance(Context context) {
        return ourInstance = new SigninRepository(context);
    }


    public void SignInRp(String email, String password) {
        Log.e(TAG, "SignInrs: " + email);
        Log.e(TAG, "SignInrs: " + password);
    }

}
