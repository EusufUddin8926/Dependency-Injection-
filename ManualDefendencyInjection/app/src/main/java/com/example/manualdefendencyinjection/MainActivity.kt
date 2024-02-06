package com.example.manualdefendencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.manualdefendencyinjection.interfaces.DaggerUserRegistrationComponent
import com.example.manualdefendencyinjection.repositories.UserRepository
import com.example.manualdefendencyinjection.services.EmailService
import com.example.manualdefendencyinjection.services.UserRegistrationService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
        userRegistrationService.registerUser("eusufuddin@gmail.com", "123456")

    }
}