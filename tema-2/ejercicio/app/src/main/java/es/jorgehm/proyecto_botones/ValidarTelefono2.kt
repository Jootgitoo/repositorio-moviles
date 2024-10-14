package es.jorgehm.proyecto_botones

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jorgehm.proyecto_botones.databinding.ActivityValidarTelefono2Binding
import es.jorgehm.proyecto_botones.databinding.ActivityValidarTelefonoBinding

class ValidarTelefono2 : AppCompatActivity() {

    private lateinit var binding: ActivityValidarTelefono2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityValidarTelefono2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.validar.setOnClickListener {
            validarTelefono(binding.telefono.text.toString())
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    fun validarTelefono(telefono: String){
        if (Patterns.PHONE.matcher(telefono).matches()){
            binding.telefono.setError(null)
        } else {
            binding.telefono.setError("Telefono invalido")
        }
    }
}