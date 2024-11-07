package es.jorgehm.ejemplofragmento

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import es.jorgehm.ejemplofragmento.databinding.ActivityMainBinding

class EjemploFragment : Fragment() {

    private lateinit var binding: FragmentEjemploBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentEjemploBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }
}