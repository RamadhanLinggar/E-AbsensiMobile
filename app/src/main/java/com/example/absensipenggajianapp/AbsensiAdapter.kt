package com.example.absensipenggajianapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.absensipenggajianapp.database.AbsensiEntity

class AbsensiAdapter : RecyclerView.Adapter<AbsensiAdapter.ViewHolder>() {

    private var listAbsensi = listOf<AbsensiEntity>()

    fun setData(data: List<AbsensiEntity>) {
        listAbsensi = data
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtTanggal: TextView = view.findViewById(R.id.txtTanggal)
        val txtWaktu: TextView = view.findViewById(R.id.txtWaktu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_absensi, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listAbsensi.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listAbsensi[position]

        holder.txtTanggal.text = "Tanggal : ${data.tanggal}"
        holder.txtWaktu.text = "Waktu : ${data.waktu}"
    }
}
