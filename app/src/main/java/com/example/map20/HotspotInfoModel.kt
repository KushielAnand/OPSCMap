package com.example.map20

data class HotspotInfoModel(
    val locId: String,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val countryCode: String,
    val countryName: String,
    val subnational1Name: String,
    val subnational1Code: String,
    val subnational2Code: String,
    val subnational2Name: String,
    val isHotspot: Boolean,
    val hierarchicalName: String,
    val locID: String
)