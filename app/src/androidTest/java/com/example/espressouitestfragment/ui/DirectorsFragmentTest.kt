package com.example.espressouitestfragment.ui

import android.os.Bundle
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.espressouitestfragment.R
import com.example.espressouitestfragment.factory.MovieFragmentFactory
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class DirectorsFragmentTest {
    @Test
    fun test_isDirectorsListVisible() {
        val fragmentFactor = MovieFragmentFactory()
        val directors = arrayListOf("R.J. Stewart", "James Vanderbilt")
        val bundle = Bundle()
        bundle.putStringArrayList("args_directors", directors)
        val scenario = launchFragmentInContainer<DirectorsFragment>(
            fragmentArgs = bundle,
            factory = fragmentFactor
        )

        onView(withId(R.id.directors_text)).check(matches(withText(
            DirectorsFragment.stringBuilderForDirectors(directors))))
    }
}