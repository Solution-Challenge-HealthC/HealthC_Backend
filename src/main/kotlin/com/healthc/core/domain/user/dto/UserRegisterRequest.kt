package com.healthc.core.domain.user.dto

data class UserRegisterRequest(
        val kakaoId: Int,
        val nickname: String
)