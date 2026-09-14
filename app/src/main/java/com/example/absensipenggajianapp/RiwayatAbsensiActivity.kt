package com.example.absensipenggajianapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.absensipenggajianapp.database.AppDatabase
import kotlinx.coroutines.launch

class RiwayatAbsensiActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AbsensiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_absensi)

        recyclerView = findViewById(R.id.recyclerAbsensi)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = AbsensiAdapter()
        recyclerView.adapter = adapter

        loadData()
    }

    private fun loadData() {

        val dao = AppDatabase.getDatabase(this).absensiDao()

        // 🔥 Ambil username dari intent
        val username = intent.getStringExtra("USERNAME")

        lifecycleScope.launch {

            val data = if (username == null) {
                // Admin / Manager → semua data
                dao.getAllAbsensi()
            } else {
                // User → data pribadi
                dao.getAbsensiUser(username)
            }

            adapter.setData(data)
        }
    }
}
