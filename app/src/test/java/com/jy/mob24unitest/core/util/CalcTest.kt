package com.jy.mob24unitest.core.util

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalcTest {
    @Test
    fun `4 + 4 should return 8`() {
        assertEquals(Calc.add(4,4),8)
    }

    @Test
    fun `0 + 1 should return 1` () {
        assertEquals(Calc.add(0,1),1)
    }

    @Test
    fun `3 + 1 should return 4`() {
        assertEquals(Calc.add(3,1),4)
    }

}