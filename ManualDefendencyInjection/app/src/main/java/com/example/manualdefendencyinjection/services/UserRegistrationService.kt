package com.example.manualdefendencyinjection.services

import com.example.manualdefendencyinjection.repositories.UserRepository
import javax.inject.Inject

class UserRegistrationService @Inject constructor(private var userRepository: UserRepository, private var emailService: EmailService) {

    fun registerUser(email: String, pass: String){
        userRepository.saveUser(email = email, password = pass)
        emailService.send(email, "eusuf.cse@gmail.com", "User Registered")
    }

}