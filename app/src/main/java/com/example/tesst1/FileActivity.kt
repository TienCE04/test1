package com.example.tesst1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tesst1.databinding.FileActivityBinding
import com.google.android.material.tabs.TabLayoutMediator

class FileActivity : AppCompatActivity() {
    private lateinit var binding: FileActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FileActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
        initListener()
    }

    private fun initAdapter() {
        val adapterPage = ViewPagerAdapter(this)
        binding.viewPager2.adapter = adapterPage
        val viewPager2 = binding.viewPager2
        val tabLayout = binding.tabLayout
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = when (position) {
                0 -> "Image/Video"
                1 -> "File"
                2 -> "Link"
                else -> "Image/Video"
            }
        }.attach()
    }

    private fun initListener() {

    }
}