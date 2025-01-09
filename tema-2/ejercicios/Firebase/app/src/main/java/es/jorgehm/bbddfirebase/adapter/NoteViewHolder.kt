package es.jorgehm.bbddfirebase.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import es.jorgehm.bbddfirebase.databinding.ItemNoteBinding

class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = ItemNoteBinding.bind(itemView)
    val titulo: TextView = binding.title
    val contenido: TextView = binding.content
}