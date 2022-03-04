package com.company.stack.interfaces;

import com.company.models.Box;

public interface Stack {
    void push(Box element);
    Box pop();
    Box peek();

    boolean isEmpty();
}
