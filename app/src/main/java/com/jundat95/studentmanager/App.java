package com.jundat95.studentmanager;

import android.app.Application;
import android.content.Context;

/**
 * Created by tinhngo on 20/09/2017.
 */

public class App extends Application {

    private static App mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static App getmInstance() {
        if (mInstance == null)
            mInstance = new App();
        return mInstance;
    }

    public static Context getContext() {
        return getmInstance().getApplicationContext();
    }

}
