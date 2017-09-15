package com.sy.androidftpservicedemo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.sy.androidftpservicedemo.service.FtpService;

/**
 * 创建时间： 2017/9/15 0015.
 * 编写人：Tina
 * 邮箱：1208156801@qq.com
 * 功能描述： 系统广播，开机启动
 */

public class BootReceiver extends BroadcastReceiver{
    private String TAG = BootReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        Log.d(TAG, "action = " + action);

        Intent serviceIntent;
        if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            Log.d(TAG, "receive ACTION_BOOT_COMPLETED.");

            serviceIntent = new Intent(context, FtpService.class);
            context.startService(serviceIntent);
        }
    }
}
