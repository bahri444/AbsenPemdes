package com.example.absenpemdesv1

import java.util.Date

data class GetAllResponse (
    val absen_uuid: String,
    val user_uuid:String,
    val tanggal_absen: Date,
    val jarak_koordinat: Int,
    val jam_masuk: Date,
    val jam_pulang: Date
)