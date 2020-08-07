package com.example.espressouitestfragment.factory

import androidx.fragment.app.FragmentFactory
import com.example.espressouitestfragment.ui.DirectorsFragment
import com.example.espressouitestfragment.ui.MovieDetailFragment
import com.example.espressouitestfragment.ui.StarActorsFragment

class MovieFragmentFactory : FragmentFactory(){

    private val TAG: String = "AppDebug"

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className){

            MovieDetailFragment::class.java.name -> {
                MovieDetailFragment()
            }

            DirectorsFragment::class.java.name -> {
                DirectorsFragment()
            }

            StarActorsFragment::class.java.name -> {
                StarActorsFragment()
            }

            else -> {
                super.instantiate(classLoader, className)
            }
        }
}