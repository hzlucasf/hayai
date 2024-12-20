package com.hzlucasf.hayai.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackTest {
    @Test
    public void isEmptyStackTest() {
        var stack = new Stack<>();

        Assertions.assertTrue(stack.isEmpty());

        stack.push(new Object());

        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    public void getLengthOfEmptyStackTest() {
        var stack = new Stack<>();

        Assertions.assertEquals(0, stack.getLength());
    }
}
