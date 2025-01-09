package es.jorgehm.bbddfirebase.viewModel

//Intermediario entre la bbdd y la interfaz de usuario
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import es.jorgehm.bbddfirebase.model.Note
import es.jorgehm.bbddfirebase.persistence.NoteRepository


class NoteViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: NoteRepository
    lateinit var notesLiveData: LiveData<List<Note>>

    init {
        repository = NoteRepository()
        getNotes()
    }

    fun addNote(titulo: String, contenido: String) {
        val note = Note(null, titulo, contenido)
        repository.addNote(note)
    }

    private fun getNotes() {
        notesLiveData= repository.getNotes()
    }
}