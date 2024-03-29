package org.Assignment.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        StringUtils utils = new StringUtils();
        
        assertEquals("olleh", utils.reverse("hello"));
        assertEquals("", utils.reverse(""));
        assertEquals("a", utils.reverse("a"));
    }

    @Test
    public void testIsPalindrome() {
        StringUtils utils = new StringUtils();

        assertTrue(utils.isPalindrome("radar"));
        assertFalse(utils.isPalindrome("hello"));
        assertTrue(utils.isPalindrome(""));
    }

    @Test
    public void testConcatenate() {
        StringUtils utils = new StringUtils();

        assertEquals("HelloWorld", utils.concatenate("Hello", "World"));
        assertEquals("test", utils.concatenate("test", ""));
        assertEquals("123", utils.concatenate("", "123"));
    }

    @Test
    public void testCountOccurrences() {
        StringUtils utils = new StringUtils();

        assertEquals(2, utils.countOccurrences("hello", 'l'));
        assertEquals(0, utils.countOccurrences("world", 'z'));
        assertEquals(2, utils.countOccurrences("programming", 'm'));
    }
}