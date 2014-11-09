package introduction.to.algorithms.chapter2;

import java.util.Arrays;

import introduction.to.algorithms.util.Util;

public class SelectSort {
	public static void main(String[] args) {
		int[] array = new int[] { 5, 2, 4, 7, 1, 3, 2, 6, 45, 56, 32, 23, 23,
				23, 23 };
		selectSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void selectSort(int[] array) {
		for (int j = 1; j < array.length; j++) {
			int selectIndex = j;
			for (int k = j; k < array.length; k++) {
				if (array[k] < array[selectIndex]) {
					selectIndex = k;
				}
			}

			Util.swap(array, j - 1, selectIndex);
		}
	}

}
