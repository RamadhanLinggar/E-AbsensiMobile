package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecurityDataKaryawanManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_security_data_karyawan_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailSarno).setOnClickListener {
            startActivity(Intent(this, DetailPenggunaDataKaryawanSarnoActivity::class.java))
        }

        findViewById<ImageView>(R.id.btnDetailGerald).setOnClickListener {
            startActivity(Intent(this, DetailPenggunaDataKaryawanGeraldActivity::class.java))
        }


    }
}
