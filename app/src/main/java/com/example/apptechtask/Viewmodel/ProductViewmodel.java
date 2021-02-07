package com.example.apptechtask.Viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.apptechtask.List.ProductList.ProductList;
import com.example.apptechtask.Repository.ProductRepository;

public class ProductViewmodel extends AndroidViewModel {

    public MutableLiveData<ProductList> productListMutableLiveData;
    private ProductRepository productRepository;

    public ProductViewmodel(Application application) {
        super(application);
        productRepository = ProductRepository.getInstance(application.getApplicationContext());
        productListMutableLiveData = productRepository.productListMutableLiveData;
    }

    public MutableLiveData<ProductList> Product() {
        return productListMutableLiveData;
    }
}
