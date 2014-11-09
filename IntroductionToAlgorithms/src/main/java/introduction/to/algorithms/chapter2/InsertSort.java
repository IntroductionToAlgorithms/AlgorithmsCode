package introduction.to.algorithms.chapter2;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {

	public static void sort(int[] a) {
		for (int j = 1; j < a.length; j++) {
			int key = a[j];
			for (int i = j - 1; i >= 0 && a[i] > key; i--) {
				int temp = a[i];
				a[i] = key;
				a[i + 1] = temp;
			}
			// 第二种实现方式
			/*
			 * for (int i = j; i >0; i--) { if(b[i-1]>b[i]){ int temp =b[i];
			 * b[i]=b[i-1]; b[i-1]=temp; } }
			 */
		}
	}

	public static <T extends Comparable<T>> void sort(T[] array) {

	}

	public static void insertSort(int[] array) {
		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			while (i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i--;
			}

			if (i != j - 1) {
				array[i + 1] = key;
			}
		}
	}

	public static void insertSort2(int[] array, int index) {
		System.out.println("index == " + index);
		if (index > 1) {
			insertSort2(array, index - 1);
		}
		int i = index - 1;
		int key = array[index];
		while (i >= 0 && array[i] > key) {
			array[i + 1] = array[i];
			i--;
		}
		if (i != index - 1) {
			array[i + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { 5, 2, 4, 7, 1, 3, 2, 6, 45, 56, 32, 23, 23,
				23, 23 };
		// insertSort(array);
		insertSort2(array, array.length - 1);
		System.out.println(Arrays.toString(array));
		Random random = new Random();
		
		for(int i = 0; i < 10; i++){
			System.out.println(random.nextInt(10));
		}
	}

}