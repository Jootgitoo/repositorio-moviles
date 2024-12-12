package es.jorgehm.recyclerviews

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import es.jorgehm.recyclerviews.databinding.ActivityItemCantanteBinding


class CantanteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = ActivityItemCantanteBinding.bind(itemView)

    val textView: TextView = binding.txCantante
    var isBackgroundColorChanged = false // Flag to track color state
}