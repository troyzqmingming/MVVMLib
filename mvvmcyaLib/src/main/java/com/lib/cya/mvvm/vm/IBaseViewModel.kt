package com.lib.cya.mvvm.vm

interface IBaseViewModel{

    fun onCreate()

    fun onDestroy()

    fun registerRxBus()

    fun removeRxBus()
}