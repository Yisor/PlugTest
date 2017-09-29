package xyz.eyow.sdk;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import com.komect.plugin.PluginApp;

/**
 * Created by lsl on 2017/9/28.
 */

public class TestApplication extends Application {
    @Override public void onCreate() {
        super.onCreate();
        PluginApp.init(getApplicationContext());
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
