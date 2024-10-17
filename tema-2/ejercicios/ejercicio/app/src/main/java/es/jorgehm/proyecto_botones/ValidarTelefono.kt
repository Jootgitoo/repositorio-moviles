package es.jorgehm.proyecto_botones

import android.os.Bundle
import android.util.Patterns
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jorgehm.proyecto_botones.databinding.ActivityValidarTelefonoBinding

class ValidarTelefono : AppCompatActivity() {

    private lateinit var binding : ActivityValidarTelefonoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityValidarTelefonoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun validarTelefono(view : View){
        var telefono = binding.telefono.text.toString()
        if (Patterns.PHONE.matcher(telefono).matches()){
            binding.telefono.setError(null)
        } else {
            binding.telefono.setError("Telefono inválido")
        }
    }
}