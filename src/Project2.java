import cardgames.*;

// Must add Javadoc here. See lab 1 for reference.

public class Project2 
{
	public static void main(String[] args)
	{
		Display theCards = new Display();
		
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		
		Card card1 = theDeck.dealCard();
		Card card2 = theDeck.dealCard();
		
		theCards.showCard(card1);
		theCards.showCard(card2);
		
		System.out.println("Card 1 is: " + card1.toString());
		System.out.println("Card 2 is: " + card2.toString());
				
		if (card1.getValue() == card2.getValue()) 
			System.out.println("Pair");
		else
			System.out.println("Not a pair");

	}
}
