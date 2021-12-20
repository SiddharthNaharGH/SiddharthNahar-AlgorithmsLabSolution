package com.greatlearning.service;

public class NotesCount {

	
	public void notesCountImplementation(int[] notes,int amount)
	{
		int[] notesCount =new int[3];
		boolean amountAchievable = false;
		try{
			for(int i = 0;i<notes.length;i++)
		
		{
			if(amount>=notes[i])
			{
				notesCount[i] = amount/notes[i];
				amount = amount - notesCount[i]*notes[i];
				if(amount == 0)
				amountAchievable = true;
			}
			
		}
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Any denomination cannot be 0");
		}
		
		if(amountAchievable)
			{
				System.out.println("Amount can be paid using below notes count--->");
				for(int i=0;i<3;i++)
				{
					if(notesCount[i]!= 0)
					{
						System.out.println(notes[i] + ":"+notesCount[i]);
					}
				}
			}
		else
		{
			System.out.println("Amount cannot be paid with given set of currency denominations");
		}
		
		
	}
	
}
