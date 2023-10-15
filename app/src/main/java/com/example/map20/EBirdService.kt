package com.example.map20
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface EBirdService {
    @GET("v2/data/obs/{regionCode}/recent/notable")
    fun getNotableBirdObservations(
        @Path("regionCode") regionCode: String,
        @Query("detail") detail: String = "full",
        @Header("X-eBirdApiToken") apiKey: String
    ): Call<List<ObservationModel>>

    @GET("v2/ref/hotspot/info/{locId}")
    fun getHotspotInfo(
        @Path("locId") locId: String,
        @Header("X-eBirdApiToken") apiKey: String
    ): Call<HotspotInfoModel>
}
