package io.mobinity.wantact.aop_part4_chapter06.data.models.airquality


import com.google.gson.annotations.SerializedName

data class MeasuredValue(
    @SerializedName("coFlag")
    val coFlag: Any? = null,
    @SerializedName("coGrade")
    val coGrade: Grade? = null,
    @SerializedName("coValue")
    val coValue: String? = null,
    @SerializedName("dataTime")
    val dataTime: String? = null,
    @SerializedName("khaiGrade")
    val khaiGrade: Grade? = null,
    @SerializedName("khaiValue")
    val khaiValue: String? = null,
    @SerializedName("no2Flag")
    val no2Flag: Any? = null,
    @SerializedName("no2Grade")
    val no2Grade: Grade? = null,
    @SerializedName("no2Value")
    val no2Value: String? = null,
    @SerializedName("o3Flag")
    val o3Flag: Any? = null,
    @SerializedName("o3Grade")
    val o3Grade: Grade? = null,
    @SerializedName("o3Value")
    val o3Value: String? = null,
    @SerializedName("pm10Flag")
    val pm10Flag: Any? = null,
    @SerializedName("pm10Grade")
    val pm10Grade: Grade? = null,
    @SerializedName("pm10Value")
    val pm10Value: String? = null,
    @SerializedName("pm25Flag")
    val pm25Flag: Any? = null,
    @SerializedName("pm25Grade")
    val pm25Grade: Grade? = null,
    @SerializedName("pm25Value")
    val pm25Value: String? = null,
    @SerializedName("so2Flag")
    val so2Flag: Any? = null,
    @SerializedName("so2Grade")
    val so2Grade: Grade? = null,
    @SerializedName("so2Value")
    val so2Value: String? = null
)