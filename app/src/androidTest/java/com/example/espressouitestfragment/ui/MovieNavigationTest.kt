package com.example.espressouitestfragment.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.espressouitestfragment.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MovieNavigationTest {
    @Test
    fun test_movieFragmentNavigation() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        // NAV DirectorsFragment
        onView(withId(R.id.movie_directors)).perform(click())

        // VERIFY
        onView(withId(R.id.fragment_directors_parent)).check(matches(isDisplayed()))

        // NAV MovieDetailFragment
        pressBack()

        // VERIFY
        onView(withId(R.id.fragment_movie_detail_parent)).check(matches(isDisplayed()))

        // NAV StarActorsFragment
        onView(withId(R.id.movie_star_actors)).perform(click())

        // VERIFY
        onView(withId(R.id.fragment_star_actors_parent)).check(matches(isDisplayed()))

        // NAV MovieDetailFragment
        pressBack()

        // VERIFY
        onView(withId(R.id.fragment_movie_detail_parent)).check(matches(isDisplayed()))
    }
}