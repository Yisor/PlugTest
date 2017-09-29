package com.komect.plugin;

import android.content.Context;
import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * Created by lsl on 2017/9/28.
 */

public class PluginApp {
    public static void init(Context context) {
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
