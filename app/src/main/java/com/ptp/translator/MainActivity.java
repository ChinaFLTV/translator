package com.ptp.translator;

import android.os.Bundle;
import android.view.Gravity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.hjq.toast.ToastUtils;
import com.hjq.toast.style.WhiteToastStyle;
import com.qmuiteam.qmui.arch.QMUISwipeBackActivityManager;
import com.qmuiteam.qmui.widget.QMUITopBar;

public class MainActivity extends AppCompatActivity {


    // 2022-10-4  19:24-主程序的顶栏
    @SuppressWarnings("FieldCanBeLocal")
    private QMUITopBar topBar;
    // 2022-10-5  16:22-主程序的ViewPager
    private ViewPager2 viewPager;
    // 2022-10-5  9:56-主程序的底部导航栏
    private BottomNavigationBar navigationBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 2022-10-4  20:34-初始化界面组件
        initUI();
        // 2022-10-4  20:37-界面组件基本功能逻辑实现
        addFunction();

    }


    // 2022-10-4  20:33-初始化界面组件
    public void initUI() {

        // 2022-10-4  19:24-获取主程序界面中的组件
        topBar = findViewById(R.id.mainActivity_appBar_title_common);
        viewPager = findViewById(R.id.mainActivity_viewPager2_translateDataShow_common);
        navigationBar = findViewById(R.id.mainActivity_bottomNavigationBar_common);


        // 2022-10-4  18:51-初始化QMUI框架
        QMUISwipeBackActivityManager.init(getApplication());
        // 2022-10-5  10:26-初始化Toast框架并进行一些全局参数配置
        ToastUtils.init(getApplication());
        ToastUtils.setStyle(new WhiteToastStyle());
        ToastUtils.setGravity(Gravity.BOTTOM);

        // 2022-10-4  19:34-初始化QMUI框架相关资源
        topBar.setTitle("TRANSLATOR");
        viewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);// 2022-10-5  19:34-设置滑动方式为水平滑动
        viewPager.setCurrentItem(0);// 2022-10-5  20:02-设置当前fragment


        navigationBar.addItem(new BottomNavigationItem(R.drawable.svg_home, R.string.mainActivity_bottomNavigationBar_title_home_common_Chinese))
                .addItem(new BottomNavigationItem(R.drawable.svg_home, R.string.mainActivity_bottomNavigationBar_title_home_common_Chinese))
                .addItem(new BottomNavigationItem(R.drawable.svg_home, R.string.mainActivity_bottomNavigationBar_title_home_common_Chinese))
                .addItem(new BottomNavigationItem(R.drawable.svg_home, R.string.mainActivity_bottomNavigationBar_title_home_common_Chinese))
                .setFirstSelectedPosition(1)
                .initialise();
        navigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {


            @Override
            public void onTabSelected(int position) {

                ToastUtils.show(R.string.mainActivity_bottomNavigationBar_title_home_common_Chinese);

            }


            @Override
            public void onTabUnselected(int position) {


            }


            @Override
            public void onTabReselected(int position) {

                ToastUtils.show(R.string.mainActivity_bottomNavigationBar_title_home_common_Chinese);

            }


        });


    }


    // 2022-10-4  20:35-界面组件基本功能逻辑实现
    public void addFunction() {


    }


}