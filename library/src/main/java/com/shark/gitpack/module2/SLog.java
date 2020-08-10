package com.shark.gitpack.module2;

import android.util.Log;

public class SLog {
    public static void e(Object target, String message) {
        Log.e(target.getClass().getSimpleName(), message);
    }

    public static void d(Object target, String message) {
        Log.d(target.getClass().getSimpleName(), message);
    }
}
