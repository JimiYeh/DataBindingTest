package com.cloudinteractive.databindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.cloudinteractive.databindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewmodel: MainViewModel by viewModels()
    private val binding by dataBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.viewmodel = viewmodel

        binding.btnTest.setOnClickListener {
            Toast.makeText(this, viewmodel.testString, Toast.LENGTH_SHORT).show()
        }
    }
}