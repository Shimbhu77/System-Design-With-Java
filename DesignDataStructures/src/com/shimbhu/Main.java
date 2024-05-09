package com.shimbhu;

public class Main {

	public static void main(String[] args) {
		
		ArrayListStack<Integer> myStack = new ArrayListStack<>();
		
		System.out.println(myStack.isEmpty());
		
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		
		System.out.println(myStack.peek());
		
		myStack.pop();
		
		System.out.println(myStack.peek());
		
		myStack.push(29);
		System.out.println(myStack.peek());
		
		myStack.pop();
		System.out.println(myStack.peek());
		
		System.out.println(myStack.isEmpty());
		
	}
}
