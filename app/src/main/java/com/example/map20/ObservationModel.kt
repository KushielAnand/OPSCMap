package com.example.map20

data class ObservationModel(
    val speciesCode: String,
    val comName: String,
    val sciName: String,
    val locId: String,
    val locName: String,
    val obsDt: String,
    val howMany: Int,
    val lat: Double,
    val lng: Double,
    val obsValid: Boolean,
    val obsReviewed: Boolean,
    val locationPrivate: Boolean,
    val subnational2Code: String,
    val subnational2Name: String,
    val subnational1Code: String,
    val subnational1Name: String,
    val countryCode: String,
    val countryName: String,
    val userDisplayName: String,
    val subId: String,
    val obsId: String,
    val checklistId: String,
    val presenceNoted: Boolean,
    val hasComments: Boolean,
    val firstName: String,
    val lastName: String,
    val hasRichMedia: Boolean,
    val locID: String
)