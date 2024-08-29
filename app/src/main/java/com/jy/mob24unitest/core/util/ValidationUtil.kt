package com.jy.mob24unitest.core.util


object ValidationUtil {
    fun validateEmail(email:String): Boolean {
        val emailReg = Regex("[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+")
        return emailReg.matches(email)
    }
}