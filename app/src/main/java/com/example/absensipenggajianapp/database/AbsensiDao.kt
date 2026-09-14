package com.example.absensipenggajianapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AbsensiDao {

    // ================= INSERT DATA =================
    @Insert
    suspend fun insertAbsensi(absensi: AbsensiEntity)

    // ================= SEMUA ABSENSI =================
    // Dipakai Admin & Manager
    @Query("SELECT * FROM absensi ORDER BY id DESC")
    suspend fun getAllAbsensi(): List<AbsensiEntity>

    // ================= ABSENSI PER USER =================
    // Dipakai user (Andi / Grace)
    @Query("SELECT * FROM absensi WHERE namaUser = :nama ORDER BY id DESC")
    suspend fun getAbsensiUser(nama: String): List<AbsensiEntity>

    // ================= SEMUA ABSENSI TANPA FILTER =================
    // Alternatif Admin / Manager
    @Query("SELECT * FROM absensi")
    suspend fun getSemuaAbsensi(): List<AbsensiEntity>
}
