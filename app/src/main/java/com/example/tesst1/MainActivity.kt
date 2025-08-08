package com.example.tesst1

import android.os.Bundle
import android.view.View
import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.tesst1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }

    private fun init() {
        binding.tv1.setOnClickListener(this)
        binding.tv2.setOnClickListener(this)
        binding.btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn -> {
                Log.d("fuk", "hello")
                val intent = Intent(this, FileActivity::class.java)
                startActivity(intent)
            }
        }
    }

}