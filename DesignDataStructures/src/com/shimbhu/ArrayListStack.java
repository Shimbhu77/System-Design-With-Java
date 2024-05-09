package com.shimbhu;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements MyStack<T>{

	List<T> stackList = new ArrayList<>();
	int top = -1;

	@Override
	public void push(T t) {
		stackList.add(t);
		top++;
	}

	@Override
	public T pop() {
		T t =  stackList.remove(stackList.size()-1);
		top--;
		return t;
	}

	@Override
	public T peek() {
		return stackList.get(stackList.size()-1);
	}

	@Override
	public Boolean isEmpty() {
		return stackList.size()==0;
	}

	@Override
	public Boolean isFull() {
		return false;
	}

}
