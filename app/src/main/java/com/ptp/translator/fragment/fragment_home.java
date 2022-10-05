package com.ptp.translator.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ptp.translator.R;
import com.qmuiteam.qmui.arch.QMUIFragment;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: Mr.Li
 * @Date: 2022/10/4 下午 8:51:45
 */

public class fragment_home extends QMUIFragment {


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


    @SuppressLint("InflateParams")
    @Override
    protected View onCreateView() {

        return LayoutInflater.from(getContext()).inflate(R.layout.fragment_home, null);

    }


}