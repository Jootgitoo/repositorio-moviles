package com.example.checkboxes

import android.os.Binder
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.checkboxes.databinding.ActivityCheckBoxesBinding

class CheckBoxes : AppCompatActivity() {

    private lateinit var binding: ActivityCheckBoxesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCheckBoxesBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnMostrarPreferencias.setOnClickListener(){
            preferenciasUsuario()
        }




    }


    fun preferenciasUsuario(){

        var preferencias : String = "Las prefencias del usuario son "

        if (binding.chBoxBelleza.isChecked){
            preferencias = preferencias + "belleza, "
        }
        if(binding.chBoxFamilia.isChecked){
            preferencias = preferencias + "familia, "
        }
        if (binding.chBoxDeportes.isChecked){
            preferencias = preferencias  + "deportes, "
        }
        if (binding.chBoxComida.isChecked){
            preferencias = preferencias + "comida"
        }


        Toast.makeText(this, preferencias, Toast.LENGTH_SHORT).show()

    }
}