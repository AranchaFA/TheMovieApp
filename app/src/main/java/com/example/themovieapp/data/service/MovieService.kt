package com.example.themovieapp.data.service

import com.example.themovieapp.data.model.MovieListDTO
import com.example.themovieapp.data.repository.MovieRepositoryImpl

class MovieService(private val movieRepository: MovieRepositoryImpl) {
    suspend fun getUpcomingMovies(): MovieListDTO = movieRepository.getUpcomingMovies()
    suspend fun getTopRatedMovies(): MovieListDTO = movieRepository.getTopRatedMovies()
    suspend fun getPopularMovies(): MovieListDTO = movieRepository.getPopularMovies()
}

