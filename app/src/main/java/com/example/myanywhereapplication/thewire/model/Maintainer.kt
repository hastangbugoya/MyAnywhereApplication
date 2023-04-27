package com.example.myanywhereapplication.thewire.model


import com.google.gson.annotations.SerializedName

data class Maintainer(
    @SerializedName("github")
    var github: String? = ""
)