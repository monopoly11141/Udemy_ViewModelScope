package com.example.udemy_viewmodelscope.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers(): List<User> {

        delay(5000)
        val users: List<User> = listOf(
            User(1, "A"),
            User(2, "B"),
            User(3, "C"),
            User(4, "D"),
            User(5, "E"),
        )

        return users

    }

}