package es.jorgehm.cambioestilo

import android.os.Bundle
import android.preference.PreferenceManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val modoOscuro = AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

      // val sharedPreferences = PreferenceManager.getDefaultSharedPreferencesName(this)
       // val themeName = sharedPreferences.getString("")
    }

    fun switchToDarkMode(isDarkModeEnabled: Boolean) {
        if (isDarkModeEnabled) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        recreate()
    }
}