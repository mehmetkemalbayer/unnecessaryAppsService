package com.yaya.unnecessaryappsservice;

import android.app.ActivityManager;
import android.app.IntentService;
import android.content.Intent;

import java.util.List;

/**
 * Created by mkb on 26/12/15.
 */
public class runnigAppsService extends IntentService{

    @Override
    protected void onHandleIntent(Intent intent) {
        ActivityManager activityManager = (ActivityManager)getSystemService(ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcessInfoList = activityManager.getRunningAppProcesses();
    }
}
