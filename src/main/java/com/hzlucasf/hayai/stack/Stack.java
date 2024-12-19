package com.hzlucasf.hayai.stack;

import com.hzlucasf.hayai.node.Node;

import java.util.Optional;

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

    public Optional<T> peek() {
        if (top == null) {
            return Optional.empty();
        }

        return Optional.of(top.getValue());
    }

    public Optional<T> pop() {
        if (top == null) {
            return Optional.empty();
        }

        var value = top.getValue();

        top = top.getNextNode();

        length -= 1;

        return Optional.of(value);
    }

    public boolean contains(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        return contains(top, element);
    }

    private boolean contains(Node<T> node, T element) {
        if (node == null) {
            return false;
        }

        if (node.getValue().equals(element)) {
            return true;
        }

        return contains(node.getNextNode(), element);
    }

    public int indexOf(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        return indexOf(top, element, 0);
    }

    private int indexOf(Node<T> node, T element, int index) {
        if (node == null) {
            return -1;
        }

        if (node.getValue().equals(element)) {
            return index;
        }

        return indexOf(node.getNextNode(), element, index + 1);
    }
}
