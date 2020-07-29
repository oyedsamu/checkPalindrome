package com.byoyedele.fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun firstCheck() {
        assertEquals(false, "bababa".checkPalindrome())
        assertEquals(true, "livinggnivil".checkPalindrome())
        assertEquals("questionablecharacters".checkPalindrome(), false)
    }

    @Test
    fun removeSpecialCharacters(){
        assertEquals(true, "abba-abba-abba-abba".checkPalindrome())
        assertEquals(false, "adekunle\'elnukedah".checkPalindrome())
        assertEquals(true, "madam\nmadam".checkPalindrome())
    }
}