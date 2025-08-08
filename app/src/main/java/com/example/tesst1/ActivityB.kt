package com.example.tesst1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tesst1.databinding.Activity2Binding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}