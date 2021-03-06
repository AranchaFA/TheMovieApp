package com.example.themovieapp.data.repository

import com.example.themovieapp.data.model.MovieListResponse
import com.example.themovieapp.utils.Constants
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieRepositoryImpl(private val iMovieRepository: IMovieRepository) {

    private val movieRepositoryClient by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(IMovieRepository::class.java)
    }

    suspend fun getUpcomingMovies(): MovieListResponse =
        movieRepositoryClient.getUpcomingMovies(Constants.API_KEY)

    suspend fun getTopRatedMovies(): MovieListResponse =
        movieRepositoryClient.getTopRatedMovies(Constants.API_KEY)

    suspend fun getPopularMovies(): MovieListResponse =
        movieRepositoryClient.getPopularMovies(Constants.API_KEY)
}