package com.hzlucasf.hayai.node;

public class Node<T> {
    private T value;

    private Node<T> nextNode;

    public Node(T value, Node<T> nextNode) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }

        this.value = value;

        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
