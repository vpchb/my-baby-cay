package com.example.middleexam

data class Commodity(
    val id:Int,
    val name: String,
    val price:Double,
    val descriptor: String,
    val imageUrl:String
)

data class Equipment(
    val id:Int,
    val name: String,
    val type: String,
    val powerlevel: Int,
    val imageUrl:String
    )
val commodities = listOf(
    Commodity(1, "Commodity A", 100.0, "Description A", "url_to_image_a"),
)

val equipment = listOf(
    Equipment(1, "Equipment 1", "Type 1", 100, "image_url_1"),
)
