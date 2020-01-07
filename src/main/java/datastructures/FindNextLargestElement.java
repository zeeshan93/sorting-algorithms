package datastructures;

import java.util.Stack;

public class FindNextLargestElement {

	public static void main(String[] args) {
		int a[] = {13, 7, 6, 12};

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(a[0]);

		for (int i = 1; i < a.length; i++) {
			while (!stack.isEmpty() && stack.peek() < a[i]) {
				System.out.println(stack.pop() + " --->>> " + a[i]);
			}
			stack.push(a[i]);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop()+ " --->>> -1");
		}
	}

}
