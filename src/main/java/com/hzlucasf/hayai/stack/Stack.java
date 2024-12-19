package com.hzlucasf.hayai.stack;

import com.hzlucasf.hayai.node.Node;

public class Stack<T> {
    private Node<T> top;

    private int length;

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
