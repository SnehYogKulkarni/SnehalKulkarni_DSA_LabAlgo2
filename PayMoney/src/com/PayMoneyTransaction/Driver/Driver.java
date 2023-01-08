package com.PayMoneyTransaction.Driver;

import java.util.*;
import com.PayMoneyTransaction.Service.*;

public class Driver {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		TransactionService transactionService = new TransactionService();
		
		System.out.print(" Enter Size of Transaction array :: ");
		
		try {
			
		int size = sc.nextInt();
		
		long transactions [] = new long [size];
		
		System.out.println("\n Enter Values of Array ");
		
		for (int i = 0; i < size; i++) 
			
			transactions[i]  =  sc.nextLong();
		
		System.out.print("\n Enter total no. of targets that needs to be achieved ::");
		
		int targetNo = sc.nextInt();
		
		for(int i = 0; i < targetNo; i++) {
			
			System.out.print("\n Enter Value of Target :: ");
			
			long target =  sc.nextLong();
			
			int targetChecked = transactionService.targetAchieved(transactions , target);
			
			if(targetChecked == 0)

				System.out.println("\n Given target is not achieved");
			
			else 
			
				System.out.println("\n Target achieved after "+ targetChecked  + " transactions");
		}
		
	} catch(InputMismatchException e) {
		
		System.out.println(" Exception : Only Integer values are allowed");
		throw new InputMismatchException("Intergers are Expected , Check Input " );
	}
         finally { sc.close();}
	}     	
}
