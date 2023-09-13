package com.enfotrix.cgs_teacher_portal

import android.content.Context
import android.content.SharedPreferences

class SharedPrefManager(context: Context) {
    public var constants = Constants()

    private val sharedPref: SharedPreferences =
        context.getSharedPreferences("myAppPrefs", Context.MODE_PRIVATE)
        private val editor: SharedPreferences.Editor = sharedPref.edit()

    ////////////////TO CHECK TEACHER HAS SELECTED A CLASS OR NOT/////////////////////
    fun setLogin(isLoggedIn: Boolean = false) {
        editor.putBoolean("isLoggedIn", isLoggedIn)
        editor.commit()




    }



}