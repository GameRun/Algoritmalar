package com.tr.algoritmalar.sorting.insertionsorting.main;

public class InsertionClass {

	public int[] insertionSort(int[] dizi) {

		int key;
		int i;
		for (int j = 1; j < dizi.length; j++) {
			key = dizi[ j ];
			i = j - 1;
			while (i >= 0 && key < dizi[i]) {
				dizi[i + 1] = dizi[i];
				i--;
			}
			dizi[i + 1] = key;
		}

		return dizi;
	}

	public int [] randomIntegerArrayGenerate(int size) {

		int [] array = new int [size];
		for(int i = 0; i<size;i++ ) {
			
			array[i] = (int)(Math.random()*1000);
		}
		return array;
		
	}
}
