/**
 * 
 */
package datastructures.quicksort;

/**
 * @author VKahnZe
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { int a[] = new int[10]; a[0] = 10;
	 * a[1] = 16; a[2] = 8; a[3] = 12; a[4] = 15; a[5] = 6; a[6] = 3; a[7] = 9; a[8]
	 * = 5; a[9] = 17; System.out.println("Array before sorting"); for (int i = 0; i
	 * < a.length; i++) { System.out.println(a[i]); } int low = 0; int high =
	 * a.length - 1; quickStart(low, high, a);
	 * System.out.println("Sorted array is "); for (int i = 0; i < a.length; i++) {
	 * System.out.println(a[i]); } }
	 */

	public void quickStart(int low, int high, int a[]) {
		if (low < high) {
			int j = partition(low, high, a);
			System.out.println("Intermediate Sort is ");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			quickStart(low, j, a);
			quickStart(j + 1, high, a);
		}
	}
	
	private static int partition(int low, int high, int a[]) {
		System.out.println("Partition between " + a[low] + " and " + a[high]);
		int pivot = low;
		int pivotValue = a[pivot];
		System.out.println("Pivot is " + pivotValue);
		int i = low, j = high + 1;
		while (i < j) {
			do {
				if (i < high)
					i++;
				else
					break;
			} while (a[i] <= a[pivot]);

			do {
				j--;
			} while (a[j] > a[pivot]);
			if (i < j) {
				swap(i, j, a);
			}
		}
		swap(pivot, j, a);
		return j;
	}

	private static void swap(int x, int y, int a[]) {
		int temp;
		temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
