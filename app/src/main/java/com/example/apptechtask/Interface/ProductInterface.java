package com.example.apptechtask.Interface;

import com.example.apptechtask.List.ProductList.ProductList;
import com.example.apptechtask.Other.Constants;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class ProductInterface {
    public static final Productget productget = null;

    public static Productget getProduct() {
        if (productget == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit.create(Productget.class);
        }
        return productget;
    }

    public interface Productget {
        @FormUrlEncoded
        @POST("test_user_products")
        Call<ProductList> getResponse(
                @Field("sno") String sno
        );
    }
}
