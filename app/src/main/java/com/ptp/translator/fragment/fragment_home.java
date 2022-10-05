package com.ptp.translator.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hjq.toast.ToastUtils;
import com.ptp.translator.R;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: Mr.Li
 * @Date: 2022/10/4 下午 8:51:45
 */

public class fragment_home extends Fragment {


    public fragment_home() {


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);

    }


    @SuppressWarnings("deprecation")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Button button = getActivity().findViewById(R.id.search);
        System.out.println("----------------onActivityCreated------------------");
        //SearchFragment<Object> searchFragment = SearchFragment.newInstance();

        button.setOnClickListener(v -> {

            //searchFragment.showFragment(getChildFragmentManager(), SearchFragment.TAG);
            System.out.println("----------------clicked!-------------");
            ToastUtils.show("heiheihei");

        });

    }


}