package com.codebrust.app.toastertestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codebrust.app.toastertestapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.testToast.setOnClickListener {
//            Toaster.toast(this)
        }
        setContentView(binding.root)
    }
}