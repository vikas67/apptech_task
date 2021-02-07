package com.example.apptechtask.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.apptechtask.R;
import com.example.apptechtask.Viewmodel.SigninViewmodel;
import com.example.apptechtask.databinding.FragmentSigninBinding;


public class SigninFragment extends Fragment {

    FragmentSigninBinding binding;
    private static final String TAG = "SigninFragment";
    SigninViewmodel signinViewmodel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_signin, container, false);
        return binding.getRoot();
//        return inflater.inflate(R.layout.fragment_signin, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        final NavController navController = Navigation.findNavController(view);
        signinViewmodel = ViewModelProviders.of(this).get(SigninViewmodel.class);
        signinViewmodel.Sigindata("test", "123");
        binding.signbtn.setOnClickListener(v -> {
            navController.navigate(R.id.action_signinFragment2_to_dashboardFragment);
        });
        binding.signup.setOnClickListener(v -> {
            navController.navigate(R.id.action_signinFragment2_to_signupFragment);
        });


    }


    private void Sigin() {

    }

    private boolean validation(String email, String password) {
        return Emailvalidation(email) && PasswordValidation(password);
    }

    private boolean PasswordValidation(String password) {
        //        password validation
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

    private boolean Emailvalidation(String email) {
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


}



















