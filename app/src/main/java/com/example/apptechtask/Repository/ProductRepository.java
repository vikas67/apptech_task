package com.example.apptechtask.Repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.apptechtask.Interface.ProductInterface;
import com.example.apptechtask.List.ProductList.ProductList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductRepository {

    private static final String TAG = "ProductRepository";
    public MutableLiveData<ProductList> productListMutableLiveData = new MutableLiveData<>();


    public static ProductRepository ourInstance;

    public static ProductRepository getInstance(Context context) {
        return ourInstance = new ProductRepository(context);
    }

    public ProductRepository(Context context) {
        productListMutableLiveData = getProduct();
    }

    private MutableLiveData<ProductList> getProduct() {

        ProductInterface.getProduct().getResponse("0").enqueue(new Callback<ProductList>() {
            @Override
            public void onResponse(Call<ProductList> call, Response<ProductList> response) {
                ProductList list = response.body();
                Log.e(TAG, "dataFt: " + list.getMessage());
                Log.e(TAG, "dataFt: " + list.getAllproducts().get(0).getActPrice());
                if (response.isSuccessful()) productListMutableLiveData.setValue(list);
            }

            @Override
            public void onFailure(Call<ProductList> call, Throwable t) {

            }
        });

        return productListMutableLiveData;
    }



}
