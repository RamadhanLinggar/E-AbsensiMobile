package com.example.absensipenggajianapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailPenggunaDataKaryawanUcokActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pengguna_data_karyawan_ucok)

        val btnRekap = findViewById<Button>(R.id.btnRekap)
        val btnKeseluruhan = findViewById<Button>(R.id.btnKeseluruhan)
        val btnHome = findViewById<Button>(R.id.btnHome)

        val layoutDetail = findViewById<View>(R.id.layoutDetail)
        val layoutRekap = findViewById<View>(R.id.layoutRekap)
        val layoutKeseluruhan = findViewById<View>(R.id.layoutKeseluruhan)

        btnRekap.setOnClickListener {
            layoutDetail.visibility = View.GONE
            layoutRekap.visibility = View.VISIBLE
            layoutKeseluruhan.visibility = View.GONE
        }

        btnKeseluruhan.setOnClickListener {
            layoutDetail.visibility = View.GONE
            layoutRekap.visibility = View.GONE
            layoutKeseluruhan.visibility = View.VISIBLE
        }

        btnHome.setOnClickListener {
            layoutDetail.visibility = View.VISIBLE
            layoutRekap.visibility = View.GONE
            layoutKeseluruhan.visibility = View.GONE
        }
    }
}
