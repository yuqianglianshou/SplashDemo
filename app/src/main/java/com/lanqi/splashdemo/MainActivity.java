package com.lanqi.splashdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //这个方法不会改变task中的activity中的顺序，效果基本等同于home键
//        应用场景：
//        比如有些activity诸如引导图之类的，用户在按返回键的时候你并不希望退出（默认就finish了），而是只希望置后台，
//        就可以调这个方法
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            moveTaskToBack(true);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
