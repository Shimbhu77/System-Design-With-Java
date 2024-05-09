package com.shimbhu;


public interface MyStack<T> {
	
	public void push(T t);
	public T pop();
	public T peek();
	public Boolean isEmpty();
	public Boolean isFull();
}



