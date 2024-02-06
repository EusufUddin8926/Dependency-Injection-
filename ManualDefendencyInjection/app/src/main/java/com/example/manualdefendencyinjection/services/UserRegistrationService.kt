package com.example.manualdefendencyinjection.services

import com.example.manualdefendencyinjection.repositories.UserRepository

class UserRegistrationService(private var userRepository: UserRepository, private var emailService: EmailService) {

    fun registerUser(email: String, pass: String){
        userRepository.saveUser(email = email, password = pass)
        emailService.send(email, "eusuf.cse@gmail.com", "User Registered")
    }

}