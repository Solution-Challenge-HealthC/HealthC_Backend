package com.healthc.core.domain.user.dao

import com.healthc.core.domain.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>