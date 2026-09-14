package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class KaryawanManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karyawan_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailAndi).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Andi")
            intent.putExtra("password", "Lilin763")
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.btnDetailAgus).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Agus")
            intent.putExtra("password", "Samir543")
            startActivity(intent)
        }


    }
}
