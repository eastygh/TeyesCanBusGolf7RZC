package com.syu.canbus.util;

import android.view.WindowManager;

public class ToolkitApp {
    public static WindowManager.LayoutParams buildOverlayLayoutParams(int width, int height) {
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.x = 0;
        lp.y = 0;
        lp.width = width;
        lp.height = height;
        lp.format = 1;
        lp.type = 2014;
        lp.flags = 256;
        lp.flags |= 56;
        lp.gravity = 51;
        return lp;
    }

    public static WindowManager.LayoutParams buildDialogLayoutParams(int width, int height) {
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.x = 0;
        lp.y = 0;
        lp.width = width;
        lp.height = height;
        lp.format = 1;
        lp.type = 2006;
        lp.flags = 256;
        lp.flags |= 56;
        lp.gravity = 51;
        return lp;
    }

//    public static boolean isScreenPort() {
//        return SystemPropertiesProxy.getString("ro.sf.hwrotation", "0").equals("90") || SystemPropertiesProxy.getString("ro.sf.hwrotation", "0").equals("180") || SystemProperties.get("ro.sf.hwrotation", "0").equals("270") || SystemPropertiesProxy.getString("ro.fyt.screen_port", "0").equals("1");
//    }

}
