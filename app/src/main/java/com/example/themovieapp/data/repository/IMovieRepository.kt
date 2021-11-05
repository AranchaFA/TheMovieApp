package com.example.themovieapp.data.repository

import com.example.themovieapp.data.model.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface IMovieRepository {
    // suspend -> asynchronous methods!
    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(@Query("api_key") apiKey: String): MovieListResponse

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Query("api_key") apiKey: String): MovieListResponse

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): MovieListResponse
}


