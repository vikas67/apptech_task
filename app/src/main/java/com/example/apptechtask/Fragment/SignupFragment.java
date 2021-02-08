package com.example.apptechtask.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.apptechtask.R;
import com.example.apptechtask.databinding.FragmentSignupBinding;


public class SignupFragment extends Fragment {

    private static final String TAG = "SignupFragment";
    private FragmentSignupBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_signup, container, false);

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_signup, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        NavController navController = Navigation.findNavController(view);

        binding.registerBtn.setOnClickListener(v -> {
            navController.navigate(SignupFragmentDirections.actionSignupFragmentToDashboardFragment());
        });
        binding.login.setOnClickListener(v -> {
            navController.navigate(SignupFragmentDirections.actionSignupFragmentToSigninFragment2());
        });
    }
}









