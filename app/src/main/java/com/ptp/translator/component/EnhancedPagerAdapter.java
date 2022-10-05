package com.ptp.translator.component;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ptp.translator.fragment.fragment_home;

import java.util.ArrayList;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: Mr.Li
 * @Date: 2022/10/5 下午 6:47:32
 */


// 2022-10-5  18:47-用于解决ViewPager中子fragment中点击事件失效问题
public class EnhancedPagerAdapter extends FragmentStateAdapter {


    private ArrayList<Fragment> fragments;

    {

        fragments.add(new fragment_home());
        fragments.add(new fragment_home());
        fragments.add(new fragment_home());
        fragments.add(new fragment_home());

    }


    public EnhancedPagerAdapter(@NonNull FragmentActivity fragmentActivity) {

        super(fragmentActivity);

    }


    public EnhancedPagerAdapter(@NonNull Fragment fragment) {

        super(fragment);

    }

    public EnhancedPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {

        super(fragmentManager, lifecycle);

    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return fragments.get(position);

    }


    @Override
    public int getItemCount() {

        return fragments.size();

    }


    // 2022-10-5  18:51-告诉父view，我的单击事件我自行处理，不要阻碍我-解决ViewPager中子fragment中点击事件失效问题
/*    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(ev);

    }*/


}
