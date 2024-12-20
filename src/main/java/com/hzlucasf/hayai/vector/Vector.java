package com.hzlucasf.hayai.vector;

import java.util.Optional;

public class Vector<T> {
    private Object[] elements = new Object[10];

    private int length;

    public int getLength() {
        return length;
    }

    public void add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        if (length == elements.length) {
            var elements = new Object[this.elements.length * 2];

            System.arraycopy(this.elements, 0, elements, 0, this.elements.length);

            this.elements = elements;
        }

        elements[length] = element;

        length += 1;
    }

    @SuppressWarnings("unchecked")
    public Optional<T> get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }

        for (var i = 0; i < elements.length; i += 1) {
            if (i == index) {
                return Optional.of((T) elements[i]);
            }
        }

        return Optional.empty();
    }

    public boolean contains(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        for (var x : elements) {
            if (x.equals(element)) {
                return true;
            }
        }

        return false;
    }

    public int indexOf(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        for (var i = 0; i < elements.length; i += 1) {
            if (elements[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }
}
