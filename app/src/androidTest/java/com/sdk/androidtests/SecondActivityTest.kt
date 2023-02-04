package com.sdk.androidtests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {
    @get:Rule
    var activitySecondRule = activityScenarioRule<SecondActivity>()

    @Test
    fun secondActivityIsDisplayed() {
//        onView(withId(R.id.btnGo))
//            .perform(click())

        onView(withId(R.id.layoutSecond))
            .check(matches(isDisplayed()))
    }
}