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

    public void push(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        top = new Node<>(element, top);

        length += 1;
    }
}
