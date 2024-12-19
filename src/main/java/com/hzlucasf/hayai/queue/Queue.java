package com.hzlucasf.hayai.queue;

import com.hzlucasf.hayai.node.Node;

public class Queue<T> {
    private Node<T> start;

    private Node<T> end;

    private int length;

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
