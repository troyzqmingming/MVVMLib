package com.lib.cya.mvvm

import android.app.Activity
import com.lib.cya.mvvm.utils.ActivityTaskUtil

object MVVMSDK {

    private var taskMap = mutableMapOf<String, ArrayList<Activity>>()


    fun init() {

    }

    /**
     * 用于保存所有页面
     */
    fun addSystemActivity(activity: Activity) {
        ActivityTaskUtil.addActivity(taskMap, ActivityTaskUtil.KEY_SYSTEM, activity)
    }

    /**
     * 退出app
     */
    fun exitSystem() {
        ActivityTaskUtil.cleanActivity(taskMap, ActivityTaskUtil.KEY_SYSTEM)
    }
}