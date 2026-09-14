package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AdminManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailGrace).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Grace")
            intent.putExtra("password", "Gracies9")
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.btnDetailUcok).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Ucok")
            intent.putExtra("password", "Uccok3")
            startActivity(intent)
        }


    }
}
