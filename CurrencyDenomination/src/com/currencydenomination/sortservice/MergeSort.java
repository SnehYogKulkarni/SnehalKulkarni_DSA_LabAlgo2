package com.currencydenomination.sortservice;

public class MergeSort {

	public void sort(int[] currency, int left, int right) {

		if(left < right) {
			
			int mid = (left + right)/2;
			
			sort(currency, left, mid);
			sort(currency, mid+1, right);
			
			merge(currency, left, mid, right);	
		}
	}

	public void merge(int[] Array, int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int leftArray []  = new int[n1];
		int rightArray []  = new int[n2];
		
		for (int i = 0; i < n1; i++)
			leftArray[i] = Array[left+ i];
		
		for (int j = 0; j < n2; j++)
			rightArray[j] = Array[mid + 1 + j];
		
		int i = 0, j=0, k = left;
		
		while (i < n1 && j < n2) {
			
			if(leftArray[i] >= rightArray[j] ) {
				Array[k] = leftArray[i];
				i++;
			}
			else {
				Array[k] = rightArray[j];
				j++;
			}
			
			k++;
		}
		
		while(i < n1) {
			
			Array[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			
			Array[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
