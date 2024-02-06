package com.example.manualdefendencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.manualdefendencyinjection.repositories.UserRepository
import com.example.manualdefendencyinjection.services.EmailService
import com.example.manualdefendencyinjection.services.UserRegistrationService

class MainActivity : AppCompatActivity() {

    private lateinit var userRegistrationService: UserRegistrationService
    private lateinit var userRepository: UserRepository
    private lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userRepository = UserRepository()
        emailService = EmailService()
        userRegistrationService = UserRegistrationService(userRepository, emailService)
        userRegistrationService.registerUser("eusufuddin@gmail.com", "123456")

    }
}