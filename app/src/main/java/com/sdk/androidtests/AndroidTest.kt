package com.sdk.androidtests

object AndroidTest {
    fun validateAndroid(
        title: String,
        desc1: String,
        desc2: String,
        year: Int
    ): Boolean {
        if (title != "Android") {
            return false
        }
        if (desc1 != "Kotlin") {
            return false
        }
        if (desc2 != "Java") {
            return false
        }
        if (year != 2023) {
            return false
        }
        return true
    }
}