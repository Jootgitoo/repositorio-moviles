package es.jorgehm.preferencias



import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.preference.PreferenceFragmentCompat


class SettingsFragment: PreferenceFragmentCompat(),
    SharedPreferences.OnSharedPreferenceChangeListener {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey:
    String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
    override fun onResume() {
        super.onResume()
        preferenceManager.sharedPreferences?.registerOnSharedPreferenceChangeListener(this)
    }
    override fun onPause() {
        super.onPause()
        preferenceManager.sharedPreferences?.unregisterOnSharedPreferenceChangeListener(this)
    }
    override fun onSharedPreferenceChanged(sharedPreferences:
                                           SharedPreferences?, key: String?) {
        when (key) {
            "pref_checkbox" -> {
                val isNotificationEnabled = sharedPreferences?.getBoolean(key, true) ?: true
                Toast.makeText(this.context, "$isNotificationEnabled", Toast.LENGTH_LONG).show()

            }
            "pref_texto" -> {
                val userName = sharedPreferences?.getString(key, "Usuario") ?: "Usuario"
                Toast.makeText(this.context, "$userName", Toast.LENGTH_LONG).show()
            }
        }
    }
}