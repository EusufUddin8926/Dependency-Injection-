package com.example.manualdefendencyinjection.repositories

import android.content.ContentValues.TAG
import android.util.Log

class UserRepository {
    fun saveUser(email: String, password: String){
        Log.d(TAG, "User Saved in Db.")
    }
}