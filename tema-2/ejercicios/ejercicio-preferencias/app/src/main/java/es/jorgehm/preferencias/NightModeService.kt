package es.jorgehm.preferencias

import android.app.Service
import android.content.Intent
import android.content.IntentFilter
import android.os.IBinder

class NightModeService : Service() {

    private lateinit var timeChangeReceiver: TimeChangeReceiver

    override fun onCreate() {
        super.onCreate()
        timeChangeReceiver = TimeChangeReceiver()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Para recibir actualizaciones de tiempo cada minuto
        val filter = IntentFilter(Intent.ACTION_TIME_TICK)
        registerReceiver(timeChangeReceiver, filter)

        return START_REDELIVER_INTENT
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(timeChangeReceiver)
    }

}