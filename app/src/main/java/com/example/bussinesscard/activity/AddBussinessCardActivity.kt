package com.example.bussinesscard.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bussinesscard.databinding.ActivityAddBussinessCardBinding

class AddBussinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBussinessCardBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener() {
        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}