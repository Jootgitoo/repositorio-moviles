package com.example.ejercicio_pasword

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejercicio_pasword.databinding.ActivitySegundaPantallaBinding

class SegundaPantalla : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaPantallaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySegundaPantallaBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}