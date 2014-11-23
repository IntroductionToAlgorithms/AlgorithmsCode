package introduction.to.algorithms.chapter1;

public class QuickSort {
	public  static void quickSort(int[] a,int p,int r){
		if(p<r){
		int q = search3(a, p, r);
		quickSort(a, p, q-1);
		quickSort(a, q+1, r);
		}
	}
	
	
	public static int search(int [] a,int p,int r){
		int i=p-1;
		for (int j = p; j<r; j++) {
			if(a[j]<a[r]){
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,r);
		return i+1;
	}
	
	public static int search2(int [] a,int p,int r){
		int x = a[p];
		int i = p - 1;
		int j = r + 1;
		while (true) {
			do {
				j = j - 1;
			} while (a[j] <= x);

			do {
				i = i + 1;
			} while (a[i] >= x);

			if (i < j) {
				swap(a, i, j);
			} else {
				return j;
			}
		}
	}
	
	
	public static int search3(int[] a, int p, int r) {
		int x = a[p];
		int i = p + 1;
		int j = r;
		while (true) {
			while (j >= p && a[j] > x) {
				j--;
			}

			while (i <= r && a[i] < x) {
				i++;
			}

			if (i < j) {
				swap(a, i, j);
			} else {
				swap(a, p, j);
				return j;
			}
		}
	}
	
	public static void swap(int[] a, int j, int k) {
		int temp = a[j];
		a[j] = a[k];
		a[k] = temp;
	}
}
