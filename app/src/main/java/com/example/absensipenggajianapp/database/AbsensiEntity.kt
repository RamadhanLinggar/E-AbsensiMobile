package com.example.absensipenggajianapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "absensi")
data class AbsensiEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val namaUser: String,
    val tanggal: String,
    val waktu: String,
    val fotoPath: String
)
