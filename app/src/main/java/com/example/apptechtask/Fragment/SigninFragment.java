package com.example.apptechtask.Fragment;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.apptechtask.Interface.ProductInterface;
import com.example.apptechtask.List.ProductList.ProductList;
import com.example.apptechtask.R;
import com.example.apptechtask.Viewmodel.ProductViewmodel;
import com.example.apptechtask.databinding.FragmentSigninBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SigninFragment extends Fragment {

    FragmentSigninBinding binding;
    private static final String TAG = "SigninFragment";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_signin, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        final NavController navController = Navigation.findNavController(view);

        binding.btn.setOnClickListener(v -> {
            navController.navigate(R.id.action_signinFragment2_to_dashboardFragment);
        });
    }




}



















