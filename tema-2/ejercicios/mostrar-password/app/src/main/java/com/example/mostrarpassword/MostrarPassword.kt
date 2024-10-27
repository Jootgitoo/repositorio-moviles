package com.example.mostrarpassword

import android.os.Bundle
import android.text.InputType
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mostrarpassword.databinding.ActivityMostrarPasswordBinding

class MostrarPassword : AppCompatActivity() {

    private lateinit var binding: ActivityMostrarPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMostrarPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.chBoxMostrarPassword.setOnClickListener(){

            if(binding.chBoxMostrarPassword.isChecked){

                binding.txtPassword.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD

            } else if(! binding.chBoxMostrarPassword.isChecked) {

                binding.txtPassword.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }

        }

    }
}