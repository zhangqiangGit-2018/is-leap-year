package com.github.hcsp.calculation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        int a = new java.util.Random().nextInt(10);
        assertTrue(Main.isLeapYear(a * 400));
        assertFalse(Main.isLeapYear(a * 400 + 3));
        assertFalse(Main.isLeapYear(a * 400 + 100));
    }
}
