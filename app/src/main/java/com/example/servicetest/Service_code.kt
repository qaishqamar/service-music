package com.example.servicetest


import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.media.MediaPlayer


class Service_code: Service()
{

    private var player: MediaPlayer? = null
    override fun onBind(p0: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate() {
        super.onCreate()
        player = MediaPlayer.create(this,R.raw.abc)
        player?.setOnPreparedListener {
            println("ready to go")
        }
        player?.isLooping
        player?.start()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
        player = MediaPlayer.create(this,R.raw.abc)
        player?.setOnPreparedListener {
            println("ready to go")
        }
        player?.isLooping = true
        player?.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        super.onDestroy();
        //stopping the player when service is destroyed
        player?.stop()

    }

}

