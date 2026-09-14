package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AkunManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun_manager)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnAdmin = findViewById<Button>(R.id.btnAdmin)
        val btnUser = findViewById<Button>(R.id.btnUser)

        val layoutUserOption = findViewById<LinearLayout>(R.id.layoutUserOption)

        // BACK
        btnBack.setOnClickListener { finish() }

        // ADMIN langsung buka halaman Admin
        btnAdmin.setOnClickListener {
            startActivity(Intent(this, AdminManagerActivity::class.java))
        }

        // USER toggle submenu
        btnUser.setOnClickListener {
            layoutUserOption.visibility =
                if (layoutUserOption.visibility == View.GONE)
                    View.VISIBLE else View.GONE
        }

        // SUB USER
        findViewById<TextView>(R.id.btnKaryawan).setOnClickListener {
            startActivity(Intent(this, KaryawanManagerActivity::class.java))
        }

        findViewById<TextView>(R.id.btnSecurity).setOnClickListener {
            startActivity(Intent(this, SecurityManagerActivity::class.java))
        }

        findViewById<TextView>(R.id.btnOB).setOnClickListener {
            startActivity(Intent(this, OfficeManagerActivity::class.java))
        }

        findViewById<TextView>(R.id.btnDriver).setOnClickListener {
            startActivity(Intent(this, DriverManagerActivity::class.java))
        }
    }

    override fun onBackPressed() {
        finish()
    }
}

