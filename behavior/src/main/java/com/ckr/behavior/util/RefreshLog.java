package com.ckr.behavior.util;

import android.util.Log;

/**
 * Created by PC大佬 on 2018/2/9.
 */

public class RefreshLog {
	private static final String TAG = "RefreshLog";
	private static boolean DEBUG = false;

	public static void debug() {
		RefreshLog.DEBUG = true;
	}

	public static void Logd(String tag, String msg) {
		if (DEBUG) {
			Log.d(TAG, tag + "-->" + msg);
		}
	}

	public static void Logi(String tag, String msg) {
		if (DEBUG) {
			Log.i(TAG, tag + "-->" + msg);
		}
	}

	public static void Logw(String tag, String msg) {
		if (DEBUG) {
			Log.w(TAG, tag + "-->" + msg);
		}
	}

	public static void Loge(String tag, String msg) {
		if (DEBUG) {
			Log.e(TAG, tag + "-->" + msg);
		}
	}

	public static void Logv(String tag, String methodName, String msg) {
		if (DEBUG) {
			Log.v(TAG, tag + "-->" + msg);
		}
	}
}
