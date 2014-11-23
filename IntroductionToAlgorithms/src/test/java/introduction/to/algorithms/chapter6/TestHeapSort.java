package introduction.to.algorithms.chapter1;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestHeapSort {

	@Test
	public void testMultiElements() {
		int[] a= {4,1,3,2,16,9,10,14,8,7};
		HeapSort.heapSort(a);
		assertArrayEquals(new int[] { 1,2,3,4,7,8,9,10,14,16}, a);
	}


}
