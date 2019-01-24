package blackjack;

public class Main
{
	public static void main(String[] args)
	{
		int num1 = 22; 
		int num2 = 24;
		
		if(num1 <= 0 || num2 <= 0)
		{
			System.out.println("Numbers must be greater than 0");
		}
		else
		{
			System.out.println(blackjack.BlackJack.closestTo21(num1, num2));
		}
	}
}
