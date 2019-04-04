package com.zakariahossain.recyclerviewinkotlin.models

data class Hobby(var title: String, var preferance: Int)

//object like as static in java
object HobbySupplier {
    val hobbies = listOf(
        Hobby("Programming", 1),
        Hobby("Swimming", 5),
        Hobby("Gossiping", 6),
        Hobby("Walking", 3),
        Hobby("Talking", 2),
        Hobby("Sleeping", 4),
        Hobby("Programming", 1),
        Hobby("Swimming", 5),
        Hobby("Gossiping", 6),
        Hobby("Walking", 3),
        Hobby("Talking", 2),
        Hobby("Sleeping", 4),
        Hobby("Programming", 1),
        Hobby("Swimming", 5),
        Hobby("Gossiping", 6),
        Hobby("Walking", 3),
        Hobby("Talking", 2),
        Hobby("Sleeping", 4)
    )
}