package datastructures;

import java.util.Scanner;

import datastructures.bubblesort.BubbleSort;
import datastructures.quicksort.QuickSort;
import datastructures.selectionsort.SelectionSort;

public class Start {

	public static void main(String[] args) {
		int a[] = captureInput();
		System.out.println("Select one of the following input for respective sorting.");
		System.out.println("Select 0 for Quicksort");
		System.out.println("Select 1 for Selection sort");
		System.out.println("Select 2 for Bubble sort");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		input.close();
		switch (value) {
		case 0:
			System.out.println("Selected QuickSort");
			QuickSort qs = new QuickSort();
			qs.quickStart(0, a.length - 1, a);
			break;
		case 1:
			System.out.println("Selected Selection Sort");
			SelectionSort selectionSort = new SelectionSort();
			selectionSort.selectionSort(a);
			break;
		case 2:
			System.out.println("Selected Quick Sort");
			BubbleSort bubbleSort = new BubbleSort();
			bubbleSort.bubbleSort(a);
		default:
			break;
		}
		System.out.println("Sorted list is ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

	public static int[] captureInput() {
		Scanner input = new Scanner(System.in);
		int sizeOfArray;

		System.out.println("Please enter the size of the array");
		sizeOfArray = input.nextInt();

		int a[] = new int[sizeOfArray];

		System.out.println("Enter the elements of the array");

		for (int iter = 0; iter < sizeOfArray; iter++) {
			a[iter] = input.nextInt();
		}

		System.out.println("Elements of the array are :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		return a;
	}

}
