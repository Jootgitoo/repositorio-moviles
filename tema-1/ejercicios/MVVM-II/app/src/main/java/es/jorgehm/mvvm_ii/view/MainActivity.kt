package es.jorgehm.mvvm_ii.view


import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import es.jorgehm.mvvm_ii.databinding.ActivityMainBinding
import es.jorgehm.mvvm_ii.viewModel.CitasViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState : Bundle?){

        super.onCreate(savedInstanceState)

        //enlazar con layout usando binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recuperar el viewModel
        val viewModel: CitasViewModel by viewModels()

        //pintar pantalla
        binding.tvCita.text = viewModel.cita.cita
        binding.tvAutor.text = viewModel.cita.autor
    }
}