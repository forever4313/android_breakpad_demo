package com.kl.crash;

/**
 * @Description
 * @Date 2021/1/6
 */
public class Crash {
    static {
        System.loadLibrary("crash-lib");
    }
    public native void crash();

}
