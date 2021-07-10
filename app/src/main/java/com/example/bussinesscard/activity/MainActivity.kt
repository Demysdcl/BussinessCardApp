package com.example.bussinesscard.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bussinesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener() {
        binding.btnFab.setOnClickListener {
            startActivity(Intent(this@MainActivity, AddBussinessCardActivity::class.java))
        }
    }
}