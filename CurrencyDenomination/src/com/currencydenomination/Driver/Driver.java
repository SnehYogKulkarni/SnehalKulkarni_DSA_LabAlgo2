package com.currencydenomination.Driver;

import java.util.*;
import com.currencydenomination.service.*;
import com.currencydenomination.sortservice.*;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MergeSort mergeSort = new MergeSort();
		CurrencyCount currencyCount = new  CurrencyCount();
		
		System.out.print("\n Enter the size of currency denominations :: ");
		int size = sc.nextInt();
		
		int currency [] = new int[size];
		System.out.println("\n Enter the currency denominations value :: ");
		for (int i = 0;i < currency.length; i++) 
			currency[i] = sc.nextInt();
		
		System.out.print("\n Enter the amount you want to pay :: ");
		int amount = sc.nextInt();
		
		mergeSort.sort(currency, 0, currency.length-1);
		currencyCount.currencyCount(currency, amount);
		
		sc.close();
	}

}
