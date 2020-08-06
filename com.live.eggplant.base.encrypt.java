package com.live.eggplant.base.encrypt;

import java.io.Serializable;

public class EncryptUtils implements Serializable {
    static {
        System.loadLibrary("encryptLib");
    }

    public static native String getGameKey();

    public static native String getNimIv();

    public static native String getNimKv();

    public static native String getUmengIv();

    public static native String getUmengKv();

    public static native String getUmengMv();

    public static native String getVideoKv();
}