package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btnManager = findViewById<Button>(R.id.btnManager)
        val btnAdmin = findViewById<Button>(R.id.btnAdmin)
        val btnUser = findViewById<Button>(R.id.btnUser)

        val layoutAdminOption = findViewById<LinearLayout>(R.id.layoutAdminOption)
        val layoutUserOption = findViewById<LinearLayout>(R.id.layoutUserOption)

        // ================= MANAGER =================
        btnManager.setOnClickListener {
            startActivity(Intent(this, LoginManagerActivity::class.java))
        }

        // ================= ADMIN =================
        btnAdmin.setOnClickListener {
            layoutAdminOption.visibility =
                if (layoutAdminOption.visibility == View.GONE)
                    View.VISIBLE else View.GONE
            layoutUserOption.visibility = View.GONE
        }

        // ================= USER =================
        btnUser.setOnClickListener {
            layoutUserOption.visibility =
                if (layoutUserOption.visibility == View.GONE)
                    View.VISIBLE else View.GONE
            layoutAdminOption.visibility = View.GONE
        }

        // ================= SUB ADMIN =================
        btnAdmin.setOnClickListener {
            btnManager.isEnabled = false   // 🔒 kunci klik
            startActivity(Intent(this, LoginAdminActivity::class.java))
        }

        // ================= SUB USER =================
        btnUser.setOnClickListener {
            startActivity(Intent(this, LoginUserActivity::class.java))
        }

        findViewById<TextView>(R.id.btnSecurity).setOnClickListener {
            Toast.makeText(this, "Login Security", Toast.LENGTH_SHORT).show()
        }

        findViewById<TextView>(R.id.btnOffice).setOnClickListener {
            Toast.makeText(this, "Login Office Boy / Girl", Toast.LENGTH_SHORT).show()
        }

        findViewById<TextView>(R.id.btnDriver).setOnClickListener {
            Toast.makeText(this, "Login Driver", Toast.LENGTH_SHORT).show()
        }
    }
}


