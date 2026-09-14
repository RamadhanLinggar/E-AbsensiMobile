package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecurityManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_security_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailSarno).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Sarno")
            intent.putExtra("password", "tisus342")
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.btnDetailGerald).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Gerald")
            intent.putExtra("password", "Geraldino4")
            startActivity(intent)
        }


    }
}
