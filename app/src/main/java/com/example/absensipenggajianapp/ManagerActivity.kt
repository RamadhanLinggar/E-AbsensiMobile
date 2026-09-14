package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager)

        // ================= BUTTON =================
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val btnAkun = findViewById<Button>(R.id.btnDataAkun)
        val btnDataKaryawan = findViewById<Button>(R.id.btnDataKaryawan)


        val layoutLaporanOption = findViewById<LinearLayout>(R.id.layoutLaporanOption)


        // ================= LOGOUT =================
        btnLogout.setOnClickListener {
            val session = SessionManager(this)
            session.clearSession()

            val intent = Intent(this, LoginManagerActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

        // ================= BACK =================
        btnBack.setOnClickListener {
            finish()
        }

        // ================= Akun =================
        btnAkun.setOnClickListener {
            layoutLaporanOption.visibility = View.GONE
            startActivity(Intent(this, AkunManagerActivity::class.java))
        }

        // ================= Data Karyawan =================
        btnDataKaryawan.setOnClickListener {
            startActivity(Intent(this, DatakaryawanManagerActivity::class.java))
        }

    }

    override fun onBackPressed() {
        // ❌ Disable back HP (biar gak keluar)
    }
}
