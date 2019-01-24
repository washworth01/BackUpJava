package blackjackTest;

import static org.junit.Assert.*;

import org.junit.Test;

import blackjack.BlackJack;

public class BlackjackTest
{
	@Test
	public void returnHighestNumber1()
	{
		assertEquals("The second number is not returned",BlackJack.closestTo21(11, 14), 14);
	}
	
	@Test
	public void returnHighestNumber2()
	{
		assertEquals("The first number is not returned",BlackJack.closestTo21(19, 16), 19);
		
	}
	
	@Test
	public void returnHighestWithBust1()
	{
		assertEquals("The second number is not returned",BlackJack.closestTo21(24, 16), 16);
		
	} 
	
	@Test
	public void returnHighestWithBust2()
	{
		assertEquals("The first number is not returned",BlackJack.closestTo21(17, 25), 17);
		
	}
	
	@Test
	public void returnBothPlayersDraw()
	{
		assertEquals("The same number is not returned",BlackJack.closestTo21(18, 18), 18);
		
	}
	
	@Test
	public void bustEqualsZero()
	{
		assertEquals("The number retruned was not zero", BlackJack.closestTo21(24, 22), 0);
	}
	
}



