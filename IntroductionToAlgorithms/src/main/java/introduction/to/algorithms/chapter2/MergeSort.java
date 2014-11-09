package introduction.to.algorithms.chapter2;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int[] array, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(array, p, q);
			mergeSort(array, q + 1, r);
			merge2(array, p, q, r);
		}
	}

	public static void merge(int[] array, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] al = new int[n1 + 1];
		int[] ar = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			al[i] = array[p + i];
		}

		for (int j = 0; j < n2; j++) {
			ar[j] = array[q + j + 1];
		}

		al[n1] = Integer.MAX_VALUE;
		ar[n2] = Integer.MAX_VALUE;
		int m = 0, n = 0;
		for (int k = p; k <= r; k++) {
			if (al[m] < ar[n]) {
				array[k] = al[m++];
			} else {
				array[k] = ar[n++];
			}
		}
	}

	public static void merge2(int[] array, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] al = new int[n1];
		int[] ar = new int[n2];
		for (int i = 0; i < n1; i++) {
			al[i] = array[p + i];
		}

		for (int j = 0; j < n2; j++) {
			ar[j] = array[q + j + 1];
		}

		int m = 0, n = 0;
		for (int k = p; k <= r; k++) {
			if (m >= n1) {
				System.arraycopy(ar, n, array, k, r - q - n);
				break;
			}

			if (n >= n2) {
				System.arraycopy(al, m, array, k, q - p + 1 - m);
				break;
			}

			if (al[m] < ar[n]) {
				array[k] = al[m++];
			} else {
				array[k] = ar[n++];
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, 5, 2,
				4, 7, 1, 3, 2, 6, 45, 56, 32, 23, 23, 23, 23,
				Integer.MAX_VALUE, Integer.MAX_VALUE };
		mergeSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
}
