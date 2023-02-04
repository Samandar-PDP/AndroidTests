package com.sdk.androidtests

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class AndroidTestTest {
    @Test
    fun `title not equal to android returns false`() {
        val result = AndroidTest.validateAndroid(
            "Kotlin",
            "Kotlin",
            "Java",
            2003
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `desc1 not equal to kotlin returns false`() {
        val result = AndroidTest.validateAndroid(
            "Android",
            "Dart",
            "Java",
            2003
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `all parameters if true returns true`() {
        val result = AndroidTest.validateAndroid(
            "Android",
            "Kotlin",
            "Java",
            2023
        )
        assertThat(result).isTrue()
    }
}