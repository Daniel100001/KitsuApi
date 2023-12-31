package com.example.android4homework2.data.remote.apisevices

import com.example.android4homework2.data.models.AnimeResponse
import com.example.android4homework2.data.models.details.MangaDetail
import com.example.android4homework2.data.models.MangaModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MangaApiService {

    @GET("edge/manga")
    suspend fun fetchManga(
        @Query("page[limit]") pageSize: Int,
        @Query("page[offset]") offset: Int
    ): AnimeResponse<MangaModel>

    @GET("edge/manga/{id}")
    suspend fun fetchSingleManga(
        @Path("id") id: String
    ): MangaDetail
}