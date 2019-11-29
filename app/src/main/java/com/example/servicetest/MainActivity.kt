package com.example.servicetest

import android.app.Service
import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        start_btn.setOnClickListener {
            var i = intent
             i = Intent(this@MainActivity,Service_code::class.java)
            startService(i)
        }

        stop_btn.setOnClickListener {
            var i = intent
            i = Intent(this@MainActivity,Service_code::class.java)
            stopService(i)
        }

        var status = ContextCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.READ_EXTERNAL_STORAGE)

        if(status == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this,"granted",LENGTH_LONG).show()
        }
        else{

            ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),123)

        }

        var path = "/storage/sdcard0/Hike/Media/hike Profile Images/"

        var f = File(path)






    }
}
