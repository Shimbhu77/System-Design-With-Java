package com.shimbhu;

public class StrategyMethod {
	public static void main(String[] args) {
		int[] array1 = { 5, 2, 7, 1, 9 };
		int[] array2 = { 6, 2, 1, 8, 0 };
		int[] array3 = { 9, 4, 3, 7, 9 };

		SortContext context1 = new SortContext(new QuickSort());
		context1.performSort(array1); // Sort using Quick Sort

		System.out.println("Sorting Via Quick Sort");
		// Display sorted array
		for (int num : array1) {
			System.out.print(num + " ");
		}

		System.out.println();
		
		System.out.println("Sorting Via Bubble Sort");

		SortContext context2 = new SortContext(new BubbleSort());
		context2.performSort(array2); // Sort using Bubble Sort

		// Display sorted array
		for (int num : array2) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("Sorting Via Merge Sort");

		SortContext context3 = new SortContext(new MergeSort());
		context3.performSort(array3); // Sort using Merge Sort

		// Display sorted array
		for (int num : array3) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}

// step 1

//SortingStrategy.java

interface SortingStrategy {
	void sort(int[] array);
}

// step 3 
//SortContext.java
class SortContext {
	private SortingStrategy strategy;

	public SortContext(SortingStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(SortingStrategy strategy) {
		this.strategy = strategy;
	}

	public void performSort(int[] array) {
		strategy.sort(array);
	}
}

// step 2

//BubbleSort.java
class BubbleSort implements SortingStrategy {
	public void sort(int[] arr) {
		int n = arr.length;
		for (int i = n - 2; i >= 0; i--) {
			boolean flag = true;
			for (int j = 0; j <= i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					flag = false;
				}
			}

			if (flag) {
				break;
			}
		}

//     return arr;
	}
}

//QuickSort.java
class QuickSort implements SortingStrategy {
	public void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public void quickSort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}

		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot, end);
	}

	public int partition(int[] arr, int start, int end) {
		int pos = start;

		for (int i = start; i <= end; i++) {
			if (arr[i] <= arr[end]) {
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
				pos++;
			}
		}

		return pos - 1;

	}

}

//MergeSort.java
class MergeSort implements SortingStrategy {
	public void sort(int[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	public void mergeSort(int[] arr, int start, int end) {
		if (start == end) {
			return;
		}

		int mid = start + (end - start) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);

		mergeArray(arr, start, mid, end);
	}

	public void mergeArray(int[] arr, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];

		int left = start;
		int right = mid + 1;
		int index = 0;

		while (left <= mid && right <= end) {
			if (arr[left] <= arr[right]) {
				temp[index] = arr[left];
				left++;
				index++;
			} else {
				temp[index] = arr[right];
				right++;
				index++;
			}
		}

		while (left <= mid) {
			temp[index] = arr[left];
			left++;
			index++;
		}

		while (right <= end) {
			temp[index] = arr[right];
			right++;
			index++;
		}

		index = 0;

		while (start <= end) {

			arr[start] = temp[index];
			index++;
			start++;

		}
	}
}
