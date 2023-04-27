package com.example.myanywhereapplication.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.BuildConfig
import com.example.myanywhereapplication.simpsons.viewmodel.SimpsonsViewModel
import com.example.myanywhereapplication.thewire.viewmodel.TheWireViewModel

class MyViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AnywhereViewmodel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return when (com.example.myanywhereapplication.BuildConfig.FLAVOR) {
                "simpsons" -> SimpsonsViewModel() as T
                "thewire" -> TheWireViewModel() as T
                else -> AnywhereViewmodel() as T
            }
        }
        throw IllegalArgumentException("invalid viewmodel class")
    }
}
