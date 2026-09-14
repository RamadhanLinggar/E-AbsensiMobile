package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AdminDataKaryawanManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_data_karyawan_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailGrace).setOnClickListener {
            startActivity(Intent(this, ProfilAdminGraceManagerActivity::class.java))
        }

        findViewById<ImageView>(R.id.btnDetailUcok).setOnClickListener {
            startActivity(Intent(this, DetailPenggunaDataKaryawanUcokActivity::class.java))
        }


    }
}
