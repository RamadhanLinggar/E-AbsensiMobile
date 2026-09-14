package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfilUserAndiManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_user_andi_manager)

        val btnRekap = findViewById<Button>(R.id.btnRekap)
        val btnHome = findViewById<Button>(R.id.btnHome)

        val layoutDetail = findViewById<View>(R.id.layoutDetail)
        val layoutRekap = findViewById<View>(R.id.layoutRekap)
        val layoutKeseluruhan = findViewById<View>(R.id.layoutKeseluruhan)


        // 🔥 Rekap → Buka Riwayat Absensi
        btnRekap.setOnClickListener {
            val intent = Intent(this, RiwayatAbsensiActivity::class.java)
            intent.putExtra("USERNAME", "Andi")
            startActivity(intent)
        }

        // 🔥 Home
        btnHome.setOnClickListener {
            layoutDetail.visibility = View.VISIBLE
            layoutRekap.visibility = View.GONE
            layoutKeseluruhan.visibility = View.GONE
        }

    }
}
