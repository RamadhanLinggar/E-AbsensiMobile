package com.example.absensipenggajianapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginAdminActivity : AppCompatActivity() {

    private val USERNAME_ADMIN = "Grace"
    private val PASSWORD_ADMIN = "Gracies9"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_admin)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // ================= LOGIN =================
        btnLogin.setOnClickListener {
            btnLogin.isEnabled = false // 🔒 anti spam klik

            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            when {
                username.isEmpty() || password.isEmpty() -> {
                    btnLogin.isEnabled = true
                    Toast.makeText(
                        this,
                        "Isi Username dan Password",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                username == USERNAME_ADMIN && password == PASSWORD_ADMIN -> {

                    val session = SessionManager(this)
                    session.setManagerLogin(true)

                    Toast.makeText(
                        this,
                        "Login Admin Berhasil",
                        Toast.LENGTH_SHORT
                    ).show()

                    val intent = Intent(this, AdminActivity::class.java)
                    intent.flags =
                        Intent.FLAG_ACTIVITY_NEW_TASK or
                                Intent.FLAG_ACTIVITY_CLEAR_TASK

                    startActivity(intent)
                    finish()
                }

                else -> {
                    btnLogin.isEnabled = true
                    Toast.makeText(
                        this,
                        "Username atau Password salah",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        // ================= KEMBALI =================
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags =
                Intent.FLAG_ACTIVITY_CLEAR_TOP or
                        Intent.FLAG_ACTIVITY_SINGLE_TOP

            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        // 🔒 tombol back HP juga balik ke MainActivity
        val intent = Intent(this, MainActivity::class.java)
        intent.flags =
            Intent.FLAG_ACTIVITY_CLEAR_TOP or
                    Intent.FLAG_ACTIVITY_SINGLE_TOP

        startActivity(intent)
        finish()
    }
}
