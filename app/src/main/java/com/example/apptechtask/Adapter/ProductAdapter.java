package com.example.apptechtask.Adapter;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apptechtask.List.ProductList.Allproduct;
import com.example.apptechtask.List.ProductList.ProductList;
import com.example.apptechtask.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.Viewholder> {

    Context context;
    List<Allproduct> allproducts;

    public ProductAdapter(List<Allproduct> allproducts) {
        this.allproducts = allproducts;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        return new Viewholder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_product, null));
    }

    @Override
    public void onBindViewHolder(ProductAdapter.Viewholder viewholder, int i) {

    }

    @Override
    public int getItemCount() {
        return allproducts.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(View itemView) {
            super(itemView);
        }
    }
}
