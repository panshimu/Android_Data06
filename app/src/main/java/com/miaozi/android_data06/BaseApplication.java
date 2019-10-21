package com.miaozi.android_data06;

import android.app.Application;

import com.miaozi.miaozi_pay.BaseWXPayActivity;
import com.miaozi.pay_annotations.WXPayEntry;

/**
 * created by panshimu
 * on 2019/10/21
 */
@WXPayEntry(packageName = "com.miaozi.android_data06",entryClass = BaseWXPayActivity.class)
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
