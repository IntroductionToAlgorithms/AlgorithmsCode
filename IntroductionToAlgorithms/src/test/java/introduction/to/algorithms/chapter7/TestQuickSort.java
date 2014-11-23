package introduction.to.algorithms.chapter1;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestQuickSort {

	@Test
	public void testMultiElements() {
		int[] a= {4,1,3,2,16,9,10,14,8,7};
		QuickSort.quickSort(a,0,9);
		assertArrayEquals(new int[] { 1,2,3,4,7,8,9,10,14,16}, a);
	}

	@Test
	public void testMultiElements2() {
		int[] a= {4,1,3,2,16,9,10,14,8,4};
		QuickSort.quickSort(a,0,9);
		assertArrayEquals(new int[] { 1,2,3,4,4,8,9,10,14,16}, a);
	}

	@Test
	public void testMultiElements3() {
		int[] a= {4,1,3,2,16,9,10,14,8,4,16};
		QuickSort.quickSort(a,0,10);
		assertArrayEquals(new int[] { 1,2,3,4,4,8,9,10,14,16,16}, a);
	}


}
