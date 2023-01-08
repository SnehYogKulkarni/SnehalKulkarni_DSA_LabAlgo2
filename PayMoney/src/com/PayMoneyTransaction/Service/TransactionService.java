package com.PayMoneyTransaction.Service;

public class TransactionService {

	public int targetAchieved(long[] transactions, long target) {
		
		long sum = 0;
		
		for(int i = 0; i < transactions.length; i++) {
			
			sum = sum + transactions[i];
			
			if (sum >= target) {
				
				return (i+1);
			}
		}
		
		return 0;
	}

}
