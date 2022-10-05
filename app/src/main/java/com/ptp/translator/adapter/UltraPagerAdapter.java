package com.ptp.translator.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.ptp.translator.R;

public class UltraPagerAdapter extends PagerAdapter {


    @SuppressWarnings("FieldMayBeFinal")
    private boolean isMultiScrollMode;


    public UltraPagerAdapter(boolean isMultiScrollMode) {

        this.isMultiScrollMode = isMultiScrollMode;

    }


    @Override
    public int getCount() {

        return 4;

    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == object;

    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View currentView;
        switch (position) {

            case 0:
            case 1:
            case 2:
            case 3:
            default:
                currentView = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_home, null);
                container.addView(currentView);
                return currentView;

        }

    }


    @Override
    public void destroyItem(ViewGroup container, int position, @NonNull Object object) {

        View currentView = (View) object;
        container.removeView(currentView);

    }


}
