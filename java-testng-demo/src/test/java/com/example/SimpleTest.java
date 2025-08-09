package com.example;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void testPass() {
        // This test always passes
    }

    @Test
    public void testSkip() {
        throw new SkipException("Skipping this test");
    }

    @Test
    public void testFail() {
        throw new AssertionError("This test always fails");
    }
}
