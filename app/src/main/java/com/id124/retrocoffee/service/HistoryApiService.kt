package com.id124.retrocoffee.service

import com.id124.retrocoffee.model.history.HistoryResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface HistoryApiService {
    @GET("history/detail/{orId}")
    suspend fun getAllHistoryOrder(
        @Path("orId") orId: Int,
    ): HistoryResponse
}