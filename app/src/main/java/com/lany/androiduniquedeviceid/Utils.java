package com.lany.androiduniquedeviceid;


import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {
    /**
     * 生成设备不变唯一标识
     */
    public static String getUniqueDeviceId(Context context) {
        String salt = "sdgfsdgfsjkdhgs";//加盐，可以是任意字符串
        StringBuilder sb = new StringBuilder();

        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (telephonyManager != null) {
            String deviceId = telephonyManager.getDeviceId();
            if (!TextUtils.isEmpty(deviceId)) {
                sb.append(deviceId);
            }
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            String androidId = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID);
            if (!TextUtils.isEmpty(androidId)) {
                sb.append(androidId);
            }
        }
        sb.append(salt);
        sb.append(android.os.Build.MODEL);
        sb.append(android.os.Build.SERIAL);
        sb.append(android.os.Build.VERSION.RELEASE);
        sb.append(android.os.Build.VERSION.SDK_INT);

        String uniqueId = sb.toString().trim().toUpperCase();
        return md5(uniqueId);
    }

    public static String md5(String str) {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
        StringBuilder hex = new StringBuilder(hash.length * 2);
        for (byte b : hash) {
            if ((b & 0xFF) < 0x10)
                hex.append("0");
            hex.append(Integer.toHexString(b & 0xFF));
        }
        return hex.toString().toUpperCase();
    }

}
