package es.jorgehm.mvvm.viewModel

import androidx.lifecycle.ViewModel
import es.jorgehm.mvvm.model.CitaModel
import es.jorgehm.mvvm.model.ProveedorCitas

class CitasViewModel : ViewModel() {

    //Lógica para interactuar con el Modelo y preparar datos
    var cita: CitaModel

    init {
        cita = ProveedorCitas.getCitaRandom()
    }
}