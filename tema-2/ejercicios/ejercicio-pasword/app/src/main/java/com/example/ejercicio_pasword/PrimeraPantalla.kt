package com.example.ejercicio_pasword

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejercicio_pasword.databinding.ActivityPrimeraPantallaBinding

class PrimeraPantalla : AppCompatActivity() {

    companion object {
        val CONSTANTE_MENSAJE: String = "MENSAJE"

    }

    private lateinit var binding: ActivityPrimeraPantallaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPrimeraPantallaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.validar.setOnClickListener(){

            comprobarPassword(binding.textoPasword.text.toString())

        }

    }

    fun comprobarPassword(pasword : String){

        if(pasword.equals("abc123")){
            val intent = Intent(this, SegundaPantalla::class.java)
            intent.putExtra(CONSTANTE_MENSAJE, binding.textoPasword.text.toString())
            startActivity(intent)

        }else {

            Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show()

        }
    }
}