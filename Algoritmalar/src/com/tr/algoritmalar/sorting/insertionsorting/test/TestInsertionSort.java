package com.tr.algoritmalar.sorting.insertionsorting.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.tr.algoritmalar.sorting.insertionsorting.main.InsertionClass;

public class TestInsertionSort {

	InsertionClass sort;

	@Before
	public void setUp() {
		sort = new InsertionClass();

	}

	@Test
	public void testInsertSort() {

		int[] unsortedArray = { 3, 2, 3, 4, 6, 1, 5 };
		int[] sortedArray = { 1, 2, 3, 3, 4, 5, 6 };

		Assert.assertArrayEquals(sort.insertionSort(unsortedArray), sortedArray);

	}

	@Test
	public void randomvalueTest() {

		int diziBoyutu = 20;
		boolean bool = true;
		int[] dizi = sort.randomIntegerArrayGenerate(diziBoyutu);
		dizi = sort.insertionSort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			if (i + 1 < dizi.length && dizi[i] > dizi[i + 1]) {
				bool = false;
			}
			Assert.assertTrue(bool);
		}
	}

	@Test
	 public void insertionSortTimeTest() {
	
	 int diziBoyutu;
	 int[] dizi =null;
	
	 for( diziBoyutu=10000; diziBoyutu<10_000_000;diziBoyutu*=10 ) {
	 dizi = sort.randomIntegerArrayGenerate(diziBoyutu);
	 long startTime = System.currentTimeMillis();
	 sort.insertionSort(dizi);
	 long endTime = System.currentTimeMillis();
	 long estimatedTime = endTime - startTime; 
	 double seconds = (double)estimatedTime/1000; 
	 System.out.println(" Eleman  Sayısı "+ diziBoyutu + " süre " + seconds );
	 }
	 }

}
