package moe.chika.myapplication;

import android.app.Application;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class JsonApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
