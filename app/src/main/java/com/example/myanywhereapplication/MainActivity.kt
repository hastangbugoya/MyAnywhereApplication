package com.example.myanywhereapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.myanywhereapplication.databinding.ActivityMainBinding
import com.example.myanywhereapplication.simpsons.view.SimpsonsAdapter
import com.example.myanywhereapplication.thewire.view.WireAdapter
import com.example.myanywhereapplication.viewmodel.AnywhereViewmodel
import com.example.myanywhereapplication.viewmodel.MyViewModelFactory

class MainActivity : AppCompatActivity() {
    val myViewModel : AnywhereViewmodel by lazy {
        ViewModelProvider(this, MyViewModelFactory()).get(AnywhereViewmodel::class.java)
    }

    val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(LayoutInflater.from(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val myAdapter = when(BuildConfig.FLAVOR) {
            "simpsons" -> SimpsonsAdapter()
            "thewire" -> WireAdapter()
            else -> null
        }

        binding.mainRecycler.adapter = myAdapter



    }
}