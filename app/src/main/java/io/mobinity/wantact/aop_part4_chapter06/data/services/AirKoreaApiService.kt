package io.mobinity.wantact.aop_part4_chapter06.data.services

import io.mobinity.wantact.aop_part4_chapter06.BuildConfig.AIR_KOREA_SERVICE_KEY
import io.mobinity.wantact.aop_part4_chapter06.data.models.monitoringstation.MonitoringStationsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AirKoreaApiService {

    @GET(
        "B552584/MsrstnInfoInqireSvc/getNearbyMsrstnList" +
                "?serviceKey=$AIR_KOREA_SERVICE_KEY" +
                "&returnType=json"
    )
    suspend fun getNearbyMonitoringStation(
        @Query("tmX") tmX: Double,
        @Query("tmY") tmY: Double
    ): Response<MonitoringStationsResponse>

}