package com.healthc.core.domain.user.application

import com.healthc.core.domain.user.dao.UserRepository
import com.healthc.core.domain.user.domain.User
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun registerUser(user: User) {
        // You can add password hashing and other security measures here.
        userRepository.save(user)
    }
}