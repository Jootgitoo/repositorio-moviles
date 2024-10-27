package com.example.radiobuttons

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.radiobuttons.databinding.ActivityEjercicioRadioButtonsBinding

class EjercicioRadioButtons : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicioRadioButtonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEjercicioRadioButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnGuardar.setOnClickListener(){

            if(binding.rBtnDepositoDirecto.isChecked){
                Toast.makeText(this, "Comprobar ubicacion del usuario", Toast.LENGTH_LONG).show()

            } else if (binding.rBtnPaypal.isChecked){
                Toast.makeText(this, "Ingrese cantidad", Toast.LENGTH_LONG).show()
            }

        }

    }


}