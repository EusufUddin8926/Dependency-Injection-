package com.example.manualdefendencyinjection.services

import android.content.ContentValues.TAG
import android.util.Log

class EmailService {
    fun send(to: String,from: String,body: String){
        Log.d(TAG, "Email Sent.")
    }
}