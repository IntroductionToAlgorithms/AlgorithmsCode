package introduction.to.algorithms.chapter1;

public class HeapSort {
	public static void maxHeapify(int[] a, int i, int heapSize) {
		int left = left(i);
		int right = right(i);
		int largest = i;
		if (left <= heapSize && a[left] > a[i]) {
			largest = left;
		}
		if (right <= heapSize && a[right] > a[largest]) {
			largest = right;
		}

		if (largest != i) {
			swap(a, i, largest);
			maxHeapify(a, largest, heapSize);
		}
	}

	public static void swap(int[] a, int j, int k) {
		int temp = a[j];
		a[j] = a[k];
		a[k] = temp;
	}

	public static int left(int i) {
		return 2 * i + 1;
	}

	public static int right(int i) {
		return 2 * i + 2;
	}

	public static int heapSize(int[] a) {
		return a.length - 1;
	}

	public static int parent(int i) {
		return (i - 1) / 2;
	}

	public static void buildMaxHeap(int[] a) {

		//for (int i = a.length / 2; i >= 0; i--) {
		for (int i = 0; i >= a.length / 2; i++) {
			maxHeapify(a, i, a.length - 1);
		}
	}

	public static void heapSort(int[] a) {
		buildMaxHeap(a);
		int heapSize = a.length - 1;
		for (int i = a.length - 1; i >= 1; i--) {
			swap(a, 0, i);
			heapSize--;
			maxHeapify(a, 0, heapSize);
		}

	}
}
