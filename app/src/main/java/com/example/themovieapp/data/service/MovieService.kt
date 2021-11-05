package com.example.themovieapp.data.service

import com.example.themovieapp.data.model.MovieDTO
import com.example.themovieapp.data.model.MovieListResponse
import com.example.themovieapp.data.model.MovieResponse
import com.example.themovieapp.data.repository.MovieRepositoryImpl

class MovieService(private val movieRepository: MovieRepositoryImpl) {
    suspend fun getUpcomingMovies(): List<MovieDTO> =
        movieListResponseToDTO(movieRepository.getUpcomingMovies())

    suspend fun getTopRatedMovies(): List<MovieDTO> =
        movieListResponseToDTO(movieRepository.getTopRatedMovies())

    suspend fun getPopularMovies(): List<MovieDTO> =
        movieListResponseToDTO(movieRepository.getPopularMovies())

    private fun movieResponseToDTO(movieResponse: MovieResponse): MovieDTO {
        return MovieDTO(
            movieResponse.adult,
            movieResponse.backdrop_path,
            movieResponse.genre_ids,
            movieResponse.original_title,
            movieResponse.original_language,
            movieResponse.overview,
            movieResponse.popularity,
            movieResponse.poster_path,
            movieResponse.release_date,
            movieResponse.title,
            movieResponse.video,
            movieResponse.vote_average,
            movieResponse.vote_count
        )
    }

    private fun movieListResponseToDTO(movieListResponse: MovieListResponse): List<MovieDTO> {
        val movieListDTO: MutableList<MovieDTO> = mutableListOf()
        movieListResponse.results.forEach() { movieResponse ->
            movieListDTO.add(movieResponseToDTO(movieResponse))
        }
        return movieListDTO
    }

}


