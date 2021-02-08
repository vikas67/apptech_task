package com.example.apptechtask.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.apptechtask.R;

public class ViewpagerAdapter extends PagerAdapter {

    private LayoutInflater layoutInflater;


    public ViewpagerAdapter() {

    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

//        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.row_silder, container, false);

        ImageView image = (ImageView) view.findViewById(R.id.image);
        container.addView(view);

        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
