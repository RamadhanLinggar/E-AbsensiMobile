package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DriverManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailSatrio).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Satrio")
            intent.putExtra("password", "Sat97io")
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.btnDetailWawan).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Wawan")
            intent.putExtra("password", "Wanaw968")
            startActivity(intent)
        }


    }
}
