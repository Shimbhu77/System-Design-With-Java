package com.shimbhu;

public class ArrayStack<T> implements MyStack<T> {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    // Constructor
    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    // Push operation
    public void push(T element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = element;
    }

    // Pop operation
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null; // or throw an exception
        }
        return (T) stackArray[top--];
    }

    // Peek operation
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek element.");
            return null; // or throw an exception
        }
        return (T) stackArray[top];
    }

    // Check if stack is empty
    public Boolean isEmpty() {
        return (top == -1);
    }

    // Check if stack is full
    public Boolean isFull() {
        return (top == maxSize - 1);
    }
}

