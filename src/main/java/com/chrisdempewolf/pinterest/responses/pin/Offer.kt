package com.chrisdempewolf.pinterest.responses.pin

import com.google.gson.annotations.SerializedName

data class Offer(
        val price: String?,
        @SerializedName("in_stock") val inStock: Boolean?,
        val availability: Int?
)
