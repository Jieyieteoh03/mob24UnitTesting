package com.jy.mob24unitest.core.di

import android.util.Log

object Utils {
    fun debugLog (tag: String = "debugging"): (Any) -> Unit {
        return { Log.d(tag, it.toString()) }
    }
}