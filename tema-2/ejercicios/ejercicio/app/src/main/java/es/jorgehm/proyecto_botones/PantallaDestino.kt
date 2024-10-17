package es.jorgehm.proyecto_botones

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jorgehm.proyecto_botones.databinding.ActivityLlamarPantallaNuevaBinding
import es.jorgehm.proyecto_botones.databinding.ActivityPantallaDestinoBinding

class PantallaDestino : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaDestinoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPantallaDestinoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Obtengo la instancia del Intent
        val intent = intent

        //Extrayendo el extra de tipo cadena
        val mensaje = intent.getStringExtra(ValidarTelefono2.EXTRA_MENSAJE)
        val telefono = intent.getStringExtra(ValidarTelefono2.EXTRA_TELEFONO)
        binding.textSalidaInformacion.setText(" $mensaje - $telefono")
    }
}