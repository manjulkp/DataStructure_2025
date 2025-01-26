package sort;

import java.util.Arrays;

public class SortArrayWith_TwoType_OfElements {

	// even and odd
	// positive and negative
	// Sort a binary array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { -12, 10, 12, 5, -18 };
		int n = arr.length;

		sort(arr, n - 1);
		System.out.println(Arrays.toString(arr));
	}

	// use Hoare
	// positive and negative
	public static void sort(int arr[], int n) {
		int start = -1;
		int end = n + 1;

		while (true) {
			do {
				start++;
			} while (arr[start] < 0);

			do {
				end--;
			} while (arr[end] > 0);

			if (start >= end) {
				return;
			}

		//swap(arr, start, end);

		}

	}

	// use Hoare
	// Even and Odd
	public static void sortEvenOdd(int arr[], int n) {
		int start = -1;
		int end = n + 1;

		while (true) {
			do {
				start++;
			} while (arr[start]% 2 != 0);

			do {
				end--;
			} while (arr[end]% 2 == 0);

			if (start >= end) {
				return;
			}

			BubbleSorting.swap(arr, start, end);

		}

	}

}
