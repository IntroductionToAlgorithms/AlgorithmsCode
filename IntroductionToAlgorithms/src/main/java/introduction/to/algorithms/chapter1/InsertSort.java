package introduction.to.algorithms.chapter1;

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
	/*		for (int i = j; i >0; i--) {
				if(b[i-1]>b[i]){
					int temp =b[i];
					b[i]=b[i-1];
					b[i-1]=temp;
				}
			}*/
		}
	}
	
	public static <T extends Comparable<T>> void sort(T[] array) {

	}
	
}