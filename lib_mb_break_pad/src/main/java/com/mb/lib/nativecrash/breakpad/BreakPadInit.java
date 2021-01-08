package com.mb.lib.nativecrash.breakpad;

/**
 * @Description
 * @Date 2021/1/6
 */
public class BreakPadInit {
    static {
        System.loadLibrary("breakpad-core");
    }

    public static void initBreakpad(String path){
        initBreakpadNative(path);
    }

    private static native void initBreakpadNative(String path);
}
