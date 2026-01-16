package com.github.mrbean355.mappiebug

import tech.mappie.api.ObjectMappie

data class KotlinModel(
    val user: KotlinUser
)

data class KotlinUser(
    val name: String
)

object TestMapper : ObjectMappie<KotlinModel, JavaModel>()

// Fixed when uncommenting this line:
//object UserMapper : ObjectMappie<KotlinUser, JavaUser>()

fun demo() {
    val from = KotlinModel(KotlinUser("Mike"))
    val to = TestMapper.map(from)

    println(from)
    println(to)
}
