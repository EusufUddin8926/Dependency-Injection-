package com.example.manualdefendencyinjection.interfaces

import com.example.manualdefendencyinjection.services.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService(): UserRegistrationService
}