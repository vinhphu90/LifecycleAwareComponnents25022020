package com.examplevinhphutvp.lifecycleawarecomponents25022020;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyListenerLifecyle implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public  void  showLogON_CREATE (){
        Log.d("BBB" , "onCreate");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public  void  showLogON_START(){
        Log.d("BBB" , "onstart");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public  void  showLogON_RESUME(){
        Log.d("BBB" , "onResume");
    }
}
