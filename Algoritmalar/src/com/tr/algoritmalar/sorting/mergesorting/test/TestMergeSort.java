package com.tr.algoritmalar.sorting.mergesorting.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.tr.algoritmalar.sorting.mergesorting.main.MergeSort;

public class TestMergeSort {

	MergeSort sort;

	@Before
	public void setUp() {
		sort = new MergeSort();

	}

	@Test
	public void testMergeSort() {

		int[] unsortedArray = { 9, 8, 6, 2, 4, 1, 8, 4, -1, 11, 1 };
		int[] sortedArray = { -1, 1, 1, 2, 4, 4, 6, 8, 8, 9, 11 };

		Assert.assertArrayEquals(sort.sort(unsortedArray), sortedArray);

	}

	@Test
	public void randomvalueTest() {

		int diziBoyutu = 20;
		boolean bool = true;
		int[] dizi = sort.randomIntegerArrayGenerate(diziBoyutu);
		dizi = sort.sort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			if (i + 1 < dizi.length && dizi[i] > dizi[i + 1]) {
				bool = false;
			}
			Assert.assertTrue(bool);
		}
	}

	@Test
	public void mergeSortTimeTest() {

		int diziBoyutu;
		int[] dizi = null;

		for (diziBoyutu = 100; diziBoyutu < 10_000_000; diziBoyutu *= 10) {
			dizi = sort.randomIntegerArrayGenerate(diziBoyutu);
			long startTime = System.currentTimeMillis();
			sort.sort(dizi);
			long endTime = System.currentTimeMillis();
			long estimatedTime = endTime - startTime;
			double seconds = (double) estimatedTime / 1000;
			System.out.println(" Eleman  Sayısı " + diziBoyutu + " süre " + seconds);
		}
	}

}
