package com.company.stack.implemantation;

import com.company.models.Box;
import com.company.stack.exceptions.EmptyStackException;
import com.company.stack.interfaces.Stack;

public class Warehouse implements Stack {

    private Box[] data;
    private int capacity;
    private int size = 0;

    public Warehouse() {
        capacity = 10;
        data = new Box[capacity];
    }

    public Warehouse(int capacity) {
        this.capacity = capacity;
        data = new Box[this.capacity];
    }

    @Override
    public void push(Box element) {
        if (size < capacity) {
            data[size++] = element;
        }
    }

    @Override
    public Box pop() throws EmptyStackException {
        Box item;
        if (isEmpty()) {
            throw new EmptyStackException("Stack is empty");
        } else {
            item = data[size - 1];
            size--;
            data[size] = null;
        }
        return item;
    }

    @Override
    public Box peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException("Stack is empty");
        }
        return data[size];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < capacity; i++) {
            result.append(" -> ").append(data[i]).append("\n");
        }
        return result.toString();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
