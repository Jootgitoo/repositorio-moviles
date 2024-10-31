package es.jorgehm.guardarestado

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jorgehm.guardarestado.databinding.ActivityPantallaVerticalBinding
import android.R

class PantallaVertical : AppCompatActivity() {

    companion object {
        private const val SPINNER_DATA = "SPINNER_DATA"

    }

    private lateinit var binding: ActivityPantallaVerticalBinding
    private var colors = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Enlazar con layout
        binding = ActivityPantallaVerticalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPulsar.setOnClickListener{
            val colores = arrayListOf(
                "Azul",
                "Rojo",
                "Verde",
                "Morado"
            )
            addColors(colores)
        }
        
    }
    

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        
        outState.putStringArrayList(SPINNER_DATA, colors)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        
        if (savedInstanceState != null){
            val colors = savedInstanceState.getStringArrayList(SPINNER_DATA) ?: ArrayList<String>()
            addColors(colors);
        }
    }

    private fun addColors(colorsToAdd: ArrayList<String>){
        colors = colorsToAdd

        val spinnerArrayAdapted = ArrayAdapter(this, R.layout.simple_spinner_item, colorsToAdd)
        spinnerArrayAdapted.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)

        binding.spinner.adapter = spinnerArrayAdapted
        
    }
}