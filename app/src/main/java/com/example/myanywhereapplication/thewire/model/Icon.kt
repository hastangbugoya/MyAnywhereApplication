package com.example.myanywhereapplication.thewire.model


import com.google.gson.annotations.SerializedName

data class Icon(
    @SerializedName("Height")
    var height: String? = "",
    @SerializedName("URL")
    var uRL: String? = "",
    @SerializedName("Width")
    var width: String? = ""
)