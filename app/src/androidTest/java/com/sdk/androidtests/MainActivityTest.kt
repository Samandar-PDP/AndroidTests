package com.sdk.androidtests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkActivityVisibility() {
        onView(withId(R.id.layoutMain))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkingTextVisibility() {
        onView(withId(R.id.textMain))
            .check(matches(isDisplayed()))

        onView(withId(R.id.btnGo))
            .check(matches(isDisplayed()))

        onView(withId(R.id.textMain))
            .check(matches(withText(R.string.main_ac)))
    }

    @Test
    fun navigateToSecondActivity() {
        onView(withId(R.id.btnGo))
            .perform(click())

        onView(withId(R.id.layoutSecond))
            .check(matches(isDisplayed()))
    }

    @Test
    fun onBackMainActivity() {
        onView(withId(R.id.btnGo))
            .perform(click())

        onView(withId(R.id.layoutSecond))
            .check(matches(isDisplayed()))

        onView(withId(R.id.btnBack))
            .perform(click())

        onView(withId(R.id.layoutMain))
            .check(matches(isDisplayed()))
    }
}