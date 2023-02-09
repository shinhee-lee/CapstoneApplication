package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityIdpwsearchBinding

class IdpwSearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIdpwsearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityIdpwsearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}