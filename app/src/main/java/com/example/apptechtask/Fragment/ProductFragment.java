package com.example.apptechtask.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.apptechtask.Other.Constants;
import com.example.apptechtask.R;
import com.example.apptechtask.databinding.FragmentProductBinding;


public class ProductFragment extends Fragment {

    FragmentProductBinding binding;
    ProductFragmentArgs fragmentArgs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_product, container, false);
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_product, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fragmentArgs = ProductFragmentArgs.fromBundle(getArguments());

        Glide.with(view.getContext()).load(Constants.IMAGE_URL + fragmentArgs.getProductThumb()).into(binding.productThumb);
        binding.productName.setText(fragmentArgs.getProductName());
        binding.productAmt.setText(getResources().getString(R.string.rs_symbol) + fragmentArgs.getProductAmt());
        binding.productDicAmt.setText(getResources().getString(R.string.rs_symbol) + fragmentArgs.getProductDisAmt());

    }
}