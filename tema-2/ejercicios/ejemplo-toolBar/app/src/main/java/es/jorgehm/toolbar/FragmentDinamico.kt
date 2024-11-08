package es.jorgehm.toolbar

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding
import com.google.android.material.appbar.MaterialToolbar
import es.jorgehm.toolbar.databinding.ActivityFragmentDinamicoBinding
import es.jorgehm.toolbar.databinding.ActivityMainBinding

class FragmentDinamico : AppCompatActivity() {

    private lateinit var binding: ActivityFragmentDinamicoBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityFragmentDinamicoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btAddFragment.setOnClickListener{
            val fragmentoEjemplo = FragmentDinamico()
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.miFragmento, fragmentoEjemplo)
            fragmentTransaction.commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mi_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.menu_search -> {
                true
            }
            R.id.menu_info -> {
                true
            }
            else -> false
        }
    }
}