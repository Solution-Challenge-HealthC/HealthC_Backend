package com.healthc.core.domain.user.api

import com.healthc.core.domain.user.application.UserService
import com.healthc.core.domain.user.domain.User
import com.healthc.core.domain.user.dto.UserRegisterRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {
    @PostMapping("/register")
    fun registerUser(@RequestBody request: UserRegisterRequest): ResponseEntity<String> {
        // Validate the request, check if the username is unique, etc.
        // You can add validation logic here.

        // Create a new user entity and save it to the database
        val user = User(kakaoId = request.kakaoId, nickname = request.nickname)
        userService.registerUser(user)

        return ResponseEntity.ok("User registered successfully")
    }

    @GetMapping("/test")
    fun test(): ResponseEntity<String> {
        val user = User(kakaoId = 523, nickname = "test")
        userService.registerUser(user)
        //send user
        return ResponseEntity.ok(user.toString())
    }
}