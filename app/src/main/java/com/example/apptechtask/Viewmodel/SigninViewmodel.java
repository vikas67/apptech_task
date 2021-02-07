package com.example.apptechtask.Viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.example.apptechtask.Repository.SigninRepository;

public class SigninViewmodel extends AndroidViewModel {
    SigninRepository signinRepository;

    public SigninViewmodel(Application application) {
        super(application);
        signinRepository = SigninRepository.getInstance(getApplication());

    }

    public void Sigindata(String email, String password) {
        signinRepository.SignInRp(email, password);
    }


    private boolean validation(String email, String password) {
        return Email(email) && Password(password);
    }

    private boolean Email(String email) {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (!email.matches(emailPattern)) {
//            Textemail.setError("Invalid Email!");
            return false;
        } else if (email.isEmpty()) {
//            Textemail.setError("Field can not be Empty!");
            return false;
        } else {
//            email.setError(null);
//            Textemail.setError(null);
//            Textemail.setErrorEnabled(false);
            return true;
        }
    }

    private boolean Password(String password) {

        String checkPassword = "^" +
                //"(?=.*[0-9])" +         //at least 1 digit
                //"(?=.*[a-z])" +         //at least 1 lower case letter
                //"(?=.*[A-Z])" +         //at least 1 upper case letter
                "(?=.*[a-zA-Z])" +      //any letter
                //"(?=.*[@#$%^&+=])" +    //at least 1 special character
                "(?=S+$)" +           //no white spaces
                ".{4,}" +               //at least 4 characters
                "$";

        if (password.isEmpty()) {
//            Textpsw.setError("Field can not be Empty");
            return false;
        } else if (password.length() <= 7) {
//            Textpsw.setError("Field can not be Empty");
            return false;
        } else {
//            password.setError(null);
//            Textpsw.setError(null);
//            Textpsw.setErrorEnabled(false);
            return true;
        }
    }

}
