package com.yaya.unnecessaryappsservice;

import android.app.ActivityManager;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import java.util.Iterator;
import java.util.List;

/**
 * Created by mkb on 26/12/15.
 */
public class runnigAppsService extends IntentService{

    public runnigAppsService() {
        super("runningAppsService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        android.os.Debug.waitForDebugger();
        ActivityManager activityManager = (ActivityManager)getSystemService(ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcessInfoList = activityManager.getRunningAppProcesses();
        StringBuilder strBuilder = null;
        for(Iterator<ActivityManager.RunningAppProcessInfo> i = runningAppProcessInfoList.iterator(); i.hasNext(); ) {
            ActivityManager.RunningAppProcessInfo item = i.next();
            strBuilder = new StringBuilder();
            for (int j = 0; j < item.pkgList.length; j++) {
                strBuilder.append( item.pkgList[j] );
            }
            String newString = strBuilder.toString();

            System.out.println("Kemal" + strBuilder.toString());
        }
    }
}
