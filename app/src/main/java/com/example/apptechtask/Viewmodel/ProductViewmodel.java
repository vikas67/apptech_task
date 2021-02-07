package com.example.apptechtask.Viewmodel;


import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

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
