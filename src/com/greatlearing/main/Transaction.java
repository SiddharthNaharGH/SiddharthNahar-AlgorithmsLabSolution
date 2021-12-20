package com.greatlearing.main;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int transaction = sc.nextInt();
		
		int[] transactions = new int[transaction];
		System.out.println("Enter the values for array");
		
		for(int i=0;i<transactions.length;i++)
		{
			transactions[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no. of targets to be achieved");
		int noOfTargets = sc.nextInt();
		
		while(noOfTargets != 0)
		{
			boolean targetAchieved = false;
			
			long target;
			long sumOfTarget = 0;
			
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			
			for(int i = 0;i<transaction;i++)
			{
				sumOfTarget+=transactions[i];
				
				if(sumOfTarget >= target)
				{
					System.out.println("Target achieved in"+ (i+1) +"transactions");
					targetAchieved = true;
					break;
				}
			}
			if(!targetAchieved)
			{
				System.out.println("Target cannot be achieved");
			}
			noOfTargets--;
		}

	}

}
