package com.example.stockmarketapp.data.remote.dto
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListing(
        @Query("apikey") apiKey : String = API_KEY
    ): ResponseBody

    companion object{
        const val API_KEY = "GTN3EC3EHFOQJ7V5"
        const val BASE_URL = "https://alphavantage.co"
    }
}