package com.exam.tangfan.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 活动管理器
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);   //添加活动
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);    //删除活动
    }
    public static void finishAll(){
        for(Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();  //删除所有活动
            }
        }
    }
}