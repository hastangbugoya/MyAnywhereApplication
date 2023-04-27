package com.example.myanywhereapplication.thewire.model


import com.google.gson.annotations.SerializedName

data class Developer(
    @SerializedName("name")
    var name: String? = "",
    @SerializedName("type")
    var type: String? = "",
    @SerializedName("url")
    var url: String? = ""
)