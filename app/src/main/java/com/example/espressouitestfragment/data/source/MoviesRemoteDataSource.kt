package com.example.espressouitestfragment.data.source

import com.example.espressouitestfragment.data.DummyMovies.INFINITY_WAR
import com.example.espressouitestfragment.data.DummyMovies.THE_RUNDOWN
import com.example.espressouitestfragment.data.Movie

object MoviesRemoteDataSource: MoviesDataSource {

    private var MOVIES_REMOTE_DATA = LinkedHashMap<Int, Movie>(2)

    init {
        addMovie(INFINITY_WAR)
        addMovie(THE_RUNDOWN)
    }

    override fun getMovie(movieId: Int): Movie? {
        return MOVIES_REMOTE_DATA[movieId]
    }

    private fun addMovie(movie: Movie){
        MOVIES_REMOTE_DATA.put(movie.id, movie)
    }


}