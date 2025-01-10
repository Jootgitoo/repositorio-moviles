package es.jorgehm.preferencias

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import java.util.Calendar

class TimeChangeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // Verifica si es de noche y cambia el tema
        if (isNightTime()) {
            // Cambia el tema al modo oscuro
            setDarkTheme(context)
        } else {
            // Cambia el tema al modo claro
            setLightTheme(context)
        }
    }

    private fun isNightTime(): Boolean {
        val currentTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
        return currentTime >= 18 || currentTime < 6
    }

    private fun setDarkTheme(context: Context?) {
        // Cambia el tema de la app al modo oscuro
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        Log.i("TimeChangeReceiver", "setDarkTheme ON")
    }

    private fun setLightTheme(context: Context?) {
        // Cambia el tema de la app al modo claro
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        Log.i("TimeChangeReceiver", "setLightTheme ON")
    }

}