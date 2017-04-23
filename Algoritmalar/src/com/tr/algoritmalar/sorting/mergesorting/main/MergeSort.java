package com.tr.algoritmalar.sorting.mergesorting.main;

import org.omg.CORBA.INTERNAL;

public class MergeSort {

	public void mergeSort(int[] array, int p, int r) {
		int q;
		if (p < r) {

			q = (p + r) / 2;
			mergeSort(array, p, q);
			mergeSort(array, q + 1, r);
			merge(array, p, q, r);
		}
	}

	private void merge(int[] array, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;

		int li = 0;
		int ri = 0;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];

		for (li = 0; li < n1; li++) {
			L[li] = array[p + li];
		}

		for (ri = 0; ri < n2; ri++) {
			R[ri] = array[q + ri + 1];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;

		li = 0;
		ri = 0;

		for (int k = p; k <= r; k++) {
			if (L[li] <= R[ri]) {
				array[k] = L[li];
				li++;
			} else {
				array[k] = R[ri];
				ri++;
			}
		}

	}

	
	public int [] sort(int [] array) {
		MergeSort ms = new MergeSort();
		ms.mergeSort(array, 0, array.length - 1);
		return array;
	}
	
	public int [] randomIntegerArrayGenerate(int size) {

		int [] array = new int [size];
		for(int i = 0; i<size;i++ ) {
			
			array[i] = (int)(Math.random()*1000);
		}
		return array;
		
	}

}
