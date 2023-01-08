package com.currencydenomination.service;

public class CurrencyCount {

	public void currencyCount(int[] currency, int amount) {
		
		int currencyCounter [] = new int[currency.length];
		
		try {
			
		for( int i = 0; i < currency.length; i++) {
			
			currencyCounter[i] = amount / currency[i];
			amount = amount % currency[i];
		}
			
		if (amount > 0)
			System.out.println("\n Exact amount can not be given with the given denomination");
		
		else {
			 
			System.out.println("\n Your payment approach in order to give min no of notes will be :: ");
			
			for (int i = 0; i < currency.length; i++) {
				 
			   if(currencyCounter [i] != 0)
				   System.out.println(" " + currency[i] + " : " + currencyCounter[i]);
					   
			 }
		}  
		
		}catch(ArithmeticException e) {
			System.out.println( e + " Currency of denomination 0 is invalid ");
		}
	}

}
