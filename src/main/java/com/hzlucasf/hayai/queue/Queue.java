package com.hzlucasf.hayai.queue;

import com.hzlucasf.hayai.node.Node;

import java.util.Optional;

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

    public void enqueue(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        var node = new Node<>(element, null);

        if (isEmpty()) {
            start = node;

            end = start;
        } else {
            end.setNextNode(node);

            end = end.getNextNode();
        }

        length += 1;
    }

    public Optional<T> dequeue() {
        if (isEmpty()) {
            return Optional.empty();
        }

        var value = start.getValue();

        start = start.getNextNode();

        if (start == null) {
            end = null;
        }

        length -= 1;

        return Optional.of(value);
    }
}
