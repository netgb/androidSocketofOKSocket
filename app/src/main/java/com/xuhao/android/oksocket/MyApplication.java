package com.xuhao.android.oksocket;

import android.Manifest;
import android.app.Application;
import android.content.Context;

import com.xuhao.android.libsocket.sdk.OkSocket;
import com.xuhao.android.oksocket.wzb.PermissionUtils;


/**
 * Created by xuhao on 2017/5/22.
 */

public class MyApplication extends Application {

    /**
     * ȫ�������Ļ���.
     */
    public static Context CONTEXT;
    @Override
    public void onCreate() {
        super.onCreate();
        CONTEXT=getApplicationContext();

        OkSocket.initialize(this, true);
    }


}
