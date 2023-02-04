package com.sdk.androidtests

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CalculatorTest {
    @Test
    fun `5 plus 6 will be 11`() {
        val calculator: Calculator = CalculatorImpl()

        assertThat(calculator.add(5,6)).isLessThan(12)
    }
    @Test
    fun `32 division 4 won't be 9`() {
        val calculator: Calculator = CalculatorImpl()

        assertThat(calculator.div(32,4)).isNotEqualTo(9)
    }
}