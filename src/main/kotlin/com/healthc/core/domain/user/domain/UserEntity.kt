package com.healthc.core.domain.user.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private val id: Int = 0,
        val kakaoId: Int,
        val nickname: String
)