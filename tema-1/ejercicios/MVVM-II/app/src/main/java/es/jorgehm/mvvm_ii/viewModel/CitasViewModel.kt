package es.jorgehm.mvvm_ii.viewModel

import androidx.lifecycle.ViewModel
import es.jorgehm.mvvm_ii.model.CitaModel
import es.jorgehm.mvvm_ii.model.ProveedorCitas


class CitasViewModel : ViewModel() {

    //Lógica para interactuar con el Modelo y preparar datos
    var cita: CitaModel

    init {
        cita = ProveedorCitas.getCitaRandom()
    }
}