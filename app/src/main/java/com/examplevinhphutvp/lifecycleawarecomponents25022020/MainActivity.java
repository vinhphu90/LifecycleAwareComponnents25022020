package com.examplevinhphutvp.lifecycleawarecomponents25022020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleObserver;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
      MyListenerLifecyle myListenerLifecyle ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       myListenerLifecyle = new MyListenerLifecyle();
       getLifecycle().addObserver(myListenerLifecyle);

    }
}
