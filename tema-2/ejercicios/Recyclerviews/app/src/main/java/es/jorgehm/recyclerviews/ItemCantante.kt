package es.jorgehm.recyclerviews

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jorgehm.recyclerviews.databinding.ActivityItemCantanteBinding

class ItemCantante : AppCompatActivity() {
    private lateinit var binding: ActivityItemCantanteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityItemCantanteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_item_cantante)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}