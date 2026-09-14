package com.example.absensipenggajianapp

import android.content.Context

class SessionManager(context: Context) {

    private val prefs = context.getSharedPreferences("ABSENSI_SESSION", Context.MODE_PRIVATE)

    fun setManagerLogin(isLogin: Boolean) {
        prefs.edit().putBoolean("IS_MANAGER_LOGIN", isLogin).apply()
    }

    fun isManagerLogin(): Boolean {
        return prefs.getBoolean("IS_MANAGER_LOGIN", false)
    }

    fun clearSession() {
        prefs.edit().clear().apply()
    }
}
