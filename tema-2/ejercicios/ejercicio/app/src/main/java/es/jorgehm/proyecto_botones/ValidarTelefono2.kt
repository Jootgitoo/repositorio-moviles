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

    //Estas creando constantes
    companion object{
        val EXTRA_TELEFONO: String = "TELEFONO"
        val EXTRA_MENSAJE: String = "MENSAJE"
    }

    private lateinit var binding: ActivityValidarTelefono2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityValidarTelefono2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.validar.setOnClickListener {
            validarTelefono(binding.telefono.text.toString())
        }


        binding.llamadaSegundaPantalla.setOnClickListener() {
            //Los intent permiten enviar datos entre dos actividades
            val intent = Intent(this, PantallaDestino::class.java)
            intent.putExtra(EXTRA_TELEFONO, binding.telefono.text.toString())
            intent.putExtra(EXTRA_MENSAJE, "hola")
            startActivity(intent)
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