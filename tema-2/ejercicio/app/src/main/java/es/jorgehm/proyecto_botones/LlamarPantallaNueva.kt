package es.jorgehm.proyecto_botones

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jorgehm.proyecto_botones.databinding.ActivityLlamarPantallaNuevaBinding

class LlamarPantallaNueva : AppCompatActivity() {

    private lateinit var binding: ActivityLlamarPantallaNuevaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLlamarPantallaNuevaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.llamadaPantalla.setOnClickListener{
            val intent = Intent(this, LlamarPantallaNueva::class.java)
            startActivity(intent)
        }

        setContentView(R.layout.activity_llamar_pantalla_nueva)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}