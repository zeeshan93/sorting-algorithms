package datastructures.selectionsort;

public class SelectionSort {

	public void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			// consider first element as pivot
			int pivotIndex = i;
			int smallestIndex = i;
			// find the smallest element in the array
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[smallestIndex]) {
					smallestIndex = j;
				}
			}
			// swap smallest with pivot index
			swap(pivotIndex, smallestIndex, a);

			System.out.println("Elements after swap");
			for (int elem = 0; elem < a.length; elem++) {
				System.out.println(a[elem]);
			}
		}
	}

	public void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
