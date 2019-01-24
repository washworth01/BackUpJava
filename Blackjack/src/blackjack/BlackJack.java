package blackjack;

public class BlackJack 
{	
	public static int closestTo21(int num1, int num2)
	{
		
		if (num1 > 21)
		{
			num1 = 0;
			System.out.println("Player One went bust! Idiot.");
		}
		
		if (num2 > 21)
		{
			num2 = 0;
			System.out.println("Player Two went bust!. Dumbass.");
		}
		
		if(num1 > num2) 
		{
			System.out.println("Player One wins!");
			return num1;
		}
		else if(num2 > num1)
		{
			System.out.println("Player Two wins!");
			return num2;
		}
		else
		{
			if (num1 != 0)  
			{
				System.out.println("Both Players Draw! How disappointing.");
				return num1;
			}
			else
			{
				System.out.println("Both Players went bust! What a disgrace.");
				return 0;
			}
		}
	}
}



