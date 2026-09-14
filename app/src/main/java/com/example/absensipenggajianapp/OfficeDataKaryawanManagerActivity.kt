package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OfficeDataKaryawanManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_data_karyawan_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailAndri).setOnClickListener {
            startActivity(Intent(this, DetailPenggunaDataKaryawanAndriActivity::class.java))
        }

        findViewById<ImageView>(R.id.btnDetailMutia).setOnClickListener {
            startActivity(Intent(this, DetailPenggunaDataKaryawanMutiaActivity::class.java))
        }


    }
}
