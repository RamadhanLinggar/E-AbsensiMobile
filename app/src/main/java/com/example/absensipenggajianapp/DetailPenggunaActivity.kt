package com.example.absensipenggajianapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailPenggunaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pengguna)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Ambil data dari intent
        val nama = intent.getStringExtra("nama")
        val password = intent.getStringExtra("password")

        etNama.setText(nama ?: "")
        etPassword.setText(password ?: "")

        btnBack.setOnClickListener {
            finish()
        }
    }
}
