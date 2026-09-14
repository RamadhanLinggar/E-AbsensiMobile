package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OfficeManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_manager)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.btnDetailAndri).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Andri")
            intent.putExtra("password", "moses2")
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.btnDetailMutia).setOnClickListener {
            val intent = Intent(this, DetailPenggunaActivity::class.java)
            intent.putExtra("namaUser", "Amir")
            intent.putExtra("nama", "Mutia")
            intent.putExtra("password", "Mutia850")
            startActivity(intent)
        }


    }
}
