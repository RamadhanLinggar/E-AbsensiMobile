package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DriverDataKaryawanManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_data_karyawan_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailSatrio).setOnClickListener {
            startActivity(Intent(this, DetailPenggunaDataKaryawanSatrioActivity::class.java))
        }

        findViewById<ImageView>(R.id.btnDetailWawan).setOnClickListener {
            startActivity(Intent(this, DetailPenggunaDataKaryawanWawanActivity::class.java))
        }


    }
}
