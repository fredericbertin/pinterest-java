package com.chrisdempewolf.pinterest.responses.pin

data class Product(
        val name: String,
        val offer: Offer?,
        val description: String?,
        val brand: String?
)
