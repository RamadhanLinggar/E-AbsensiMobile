package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class KaryawanDataKaryawanManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karyawan_data_karyawan_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailAndi).setOnClickListener {
            startActivity(Intent(this, ProfilUserAndiManagerActivity::class.java))
        }

        findViewById<ImageView>(R.id.btnDetailAgus).setOnClickListener {
            startActivity(Intent(this, DetailPenggunaDataKaryawanAgusActivity::class.java))
        }


    }
}
