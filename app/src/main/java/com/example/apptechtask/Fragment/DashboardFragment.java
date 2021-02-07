package com.example.apptechtask.Fragment;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apptechtask.Adapter.ProductAdapter;
import com.example.apptechtask.List.ProductList.ProductList;
import com.example.apptechtask.R;
import com.example.apptechtask.Viewmodel.ProductViewmodel;
import com.example.apptechtask.databinding.FragmentDashboardBinding;

import java.util.ArrayList;
import java.util.List;


public class DashboardFragment extends Fragment {

    ProductViewmodel productViewmodel;
    MutableLiveData<ProductList> productListMutableLiveData;
    private static final String TAG = "DashboardFragment";
    FragmentDashboardBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        productViewmodel = ViewModelProviders.of(this).get(ProductViewmodel.class);
        productViewmodel.Product().observe(getActivity(), productList -> {
            Log.e(TAG, "dataFt: " + productList.getAllproducts().size());
            binding.productRecyclerview.setAdapter(new ProductAdapter(productList.getAllproducts()));
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
    }
}







