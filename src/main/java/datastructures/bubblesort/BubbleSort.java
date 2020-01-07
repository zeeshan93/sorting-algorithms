/**
 * 
 */
package datastructures.bubblesort;

/**
 * @author VKahnZe
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { int a[] = {2, 7, 4, 1, 5, 3};
	 * 
	 * System.out.println("Array before sorting"); for (int i = 0; i < a.length;
	 * i++) { System.out.println(a[i]); }
	 * 
	 * int n = a.length;
	 * 
	 * for (int x = 0; x < a.length; x++) {
	 * System.out.println("interation of x "+x); for (int i = 0; i < a.length - 1;
	 * i++) { System.out.println("interation of i "+i);
	 * 
	 * int j = i + 1; // System.out.println("interation of j "+j); if (a[i] > a[j])
	 * { swap(i, j, a); } j++; } System.out.println("========================="); }
	 * 
	 * 
	 * 
	 * for (int i = 0; i < n - 2; i++) { for (int j = 0; j < n - 2 - i; j++) { if
	 * (a[i] > a[j]) { swap(i, j, a); } } }
	 * 
	 * 
	 * for (int i = 0; i < n - 1; i++) { System.out.println("iteration of i "+i);
	 * for (int j = 0; j < n - i - 1; j++) {
	 * System.out.println("iteration of j "+j); if (a[j] > a[j + 1]) { swap(j, j +
	 * 1, a); } } System.out.println("========================="); }
	 * 
	 * System.out.println("Sorted array is "); for (int i = 0; i < a.length; i++) {
	 * System.out.println(a[i]); } }
	 */

	public void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					swap(j, j + 1, a);
				}
			}
		}
	}

	public void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
