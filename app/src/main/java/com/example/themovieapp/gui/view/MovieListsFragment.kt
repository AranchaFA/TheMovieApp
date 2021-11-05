package com.example.themovieapp.gui.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.themovieapp.R
import com.example.themovieapp.databinding.FragmentMovieListsBinding

class MovieListsFragment : Fragment(R.layout.fragment_movie_lists) {

    private lateinit var binding: FragmentMovieListsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieListsBinding.bind(view)

    }
}