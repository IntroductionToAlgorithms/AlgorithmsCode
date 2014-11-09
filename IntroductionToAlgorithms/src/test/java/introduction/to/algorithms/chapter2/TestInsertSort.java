package introduction.to.algorithms.chapter2;

import static org.junit.Assert.assertArrayEquals;

import introduction.to.algorithms.chapter2.InsertSort;
import introduction.to.algorithms.chapter2.MergeSort;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class TestInsertSort {

	@Test
	public void 测试只有1个元素() {
		int[] a = { 8 };
		InsertSort.sort(a);
		assertArrayEquals(new int[] { 8 }, a);
	}

	@Test
	public void 测试2个元素且已排序() {
		int[] a = { 6, 8 };
		InsertSort.sort(a);
		assertArrayEquals(new int[] { 6, 8 }, a);
	}

	@Test
	public void 测试2个元素未排序() {
		int[] a = { 8, 6 };
		InsertSort.sort(a);
		assertArrayEquals(new int[] { 6, 8 }, a);
	}

	@Test
	public void 测试多个元素() {
		int[] a = { 5, 2, 4, 6, 1, 3 };
		InsertSort.sort(a);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, a);
	}

	@Test
	public void 测试含重复元素() {
		int[] a = { 5, 2, 5, 6, 1, 6, 2 };
		MergeSort.mergeSort(a,0,a.length - 1);
		assertArrayEquals(new int[] { 1, 2, 2, 5, 5, 6, 6 }, a);
	}
	
	@Test
	public void testArrayNum10(){
		Random random = new Random();
		int arrayLength  = random.nextInt(10) + 1;
		int[] array = new int[arrayLength];
		int[] array2 = new int[arrayLength];
		for(int i = 0; i < arrayLength; i++){
			array[i] = random.nextInt();
		}
		System.arraycopy(array, 0, array2, 0, arrayLength);
		InsertSort.sort(array);
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		assertArrayEquals(array,array2);
	}
	
	@Test
	public void testArrayNum100(){
		Random random = new Random();
		int arrayLength  = random.nextInt(100) + 1;
		int[] array = new int[arrayLength];
		int[] array2 = new int[arrayLength];
		for(int i = 0; i < arrayLength; i++){
			array[i] = random.nextInt();
		}
		System.arraycopy(array, 0, array2, 0, arrayLength);
		InsertSort.sort(array);
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		assertArrayEquals(array,array2);
	}
	
	@Test
	public void testArrayNum1000(){
		Random random = new Random();
		int arrayLength  = random.nextInt(1000) + 1;
		int[] array = new int[arrayLength];
		int[] array2 = new int[arrayLength];
		for(int i = 0; i < arrayLength; i++){
			array[i] = random.nextInt();
		}
		System.arraycopy(array, 0, array2, 0, arrayLength);
		InsertSort.sort(array);
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		assertArrayEquals(array,array2);
	}

}
