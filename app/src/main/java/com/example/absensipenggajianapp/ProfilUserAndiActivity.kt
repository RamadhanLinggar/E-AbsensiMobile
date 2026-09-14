package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfilUserAndiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_user_andi)

        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val btnRekap = findViewById<Button>(R.id.btnRekap)
        val btnHome = findViewById<Button>(R.id.btnHome)
        val btnCamera = findViewById<ImageView>(R.id.btnCamera)

        val layoutDetail = findViewById<View>(R.id.layoutDetail)
        val layoutRekap = findViewById<View>(R.id.layoutRekap)
        val layoutKeseluruhan = findViewById<View>(R.id.layoutKeseluruhan)

        // ================= LOGOUT =================
        btnLogout.setOnClickListener {
            val session = SessionManager(this)
            session.clearSession()

            val intent = Intent(this, LoginUserActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

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

        // 🔥 Kamera → Absensi
        btnCamera.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            intent.putExtra("USERNAME", "Andi")
            startActivity(intent)
        }
    }
}
