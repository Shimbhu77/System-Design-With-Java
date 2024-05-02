package com.shimbhu;

import java.util.ArrayList;
import java.util.List;

public class IteratorMethod {

	public static void main(String[] args) {
		CustomList<String> customList = new CustomList<>();
		customList.add("A");
		customList.add("B");
		customList.add("C");

		// Using the iterator
		Iterator<String> iterator = customList.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

//Iterator interface
interface Iterator<T> {
	boolean hasNext();

	T next();
}

//Aggregate interface
interface Aggregate<T> {
	Iterator<T> createIterator();
}

// Concrete Aggregate
class CustomList<T> implements Aggregate<T> {
	private List<T> elements = new ArrayList<>();

	public void add(T element) {
		elements.add(element);
	}

	public T get(int index) {
		return elements.get(index);
	}

	public int size() {
		return elements.size();
	}

	// Concrete Iterator
	private class ListIterator implements Iterator<T> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < elements.size();
		}

		@Override
		public T next() {
			return elements.get(index++);
		}
	}

	@Override
	public Iterator<T> createIterator() {
		return new ListIterator();
	}
}
