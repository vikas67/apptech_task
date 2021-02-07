package com.example.apptechtask.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.apptechtask.List.ProductList.Allproduct;
import com.example.apptechtask.R;
import com.example.apptechtask.databinding.RowProductBinding;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.Viewholder> {

    Context context;
    List<Allproduct> allproducts;
    RowProductBinding binding;

    public ProductAdapter(List<Allproduct> allproducts) {
        this.allproducts = allproducts;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        binding = RowProductBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(ProductAdapter.Viewholder holder, int i) {
        Allproduct list = allproducts.get(i);
        binding.productName.setText(list.getName());
        binding.productAmt.setText(context.getResources().getString(R.string.rs_symbol) + list.getActPrice());
        binding.productDicountAmt.setText(context.getResources().getString(R.string.rs_symbol) + list.getDisPrice());
        Glide.with(context).load("https://yallatager.com/" + list.getThumb()).into(binding.productImg);

    }

    @Override
    public int getItemCount() {
        return allproducts.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(RowProductBinding itemView) {
            super(itemView.getRoot());
        }
    }
}
