package es.jorgehm.sqliteconlibreriaroom

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jorgehm.sqliteconlibreriaroom.model.Abogado

class AbogadoActivity : AppCompatActivity() {
    lateinit var mode:String
    var abogado: Abogado? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abogado)

        //recuperar datos
        val intent = intent
        mode = intent.getStringExtra("mode") ?: "DETAIL"
        abogado = intent.getSerializableExtra("abogado_data", Abogado::class.java)

        //pasar datos al fragmento
        val bundle = Bundle()
        bundle.putString("mode", mode)
        bundle.putSerializable("abogado_data", abogado)

        val myFragment = AbogadoFragment()
        myFragment.arguments = bundle
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, myFragment)
            .commit()
    }
}