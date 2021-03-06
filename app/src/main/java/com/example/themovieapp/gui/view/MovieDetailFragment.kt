package com.example.themovieapp.gui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.themovieapp.R
import com.example.themovieapp.databinding.FragmentMovieDetailBinding

class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    private lateinit var binding: FragmentMovieDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieDetailBinding.bind(view)

    }
}