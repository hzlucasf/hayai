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

    @Test
    public void getLengthOfNotEmptyStackTest() {
        var stack = new Stack<>();

        stack.push(new Object());

        Assertions.assertEquals(1, stack.getLength());

        stack.push(new Object());

        Assertions.assertEquals(2, stack.getLength());

        stack.push(new Object());

        Assertions.assertEquals(3, stack.getLength());
    }

    @Test
    public void pushNullElementOnStackTest() {
        var stack = new Stack<>();

        Assertions.assertThrows(IllegalArgumentException.class, () -> stack.push(null));
    }
}
