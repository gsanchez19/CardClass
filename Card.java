
public class Card {

	public final static int clubs = 0;
	public final static int diamonds = 1;
	public final static int spades = 2;
	public final static int hearts = 3;
	
	public final static int jack = 11;
	public final static int queen = 12;
	public final static int king = 13;
	public final static int ace = 1;
	
	private String suit;
	private String value;

	
	public Card(String value, String suit)
	{
		this.value = getVal(); 
		this.suit = getSuit();
	}
	
	// To do:
	// Create method to assign # value to card.
	// Create method to assign suit value to card.
	// Create method to return value of card.
	// Create method to return suit value of card.
	// Create method to get both values of card.
	// Math.random() * (7)
	public void setCard()
	{
		
	}
	
	public String getVal()
	{
		int fValue = (int)(Math.random() * (13) + 1);
		String gValue = String.valueOf(fValue);
		if(fValue == jack)
		{
			gValue = "Jack"; 
		}
		
		else if(fValue == queen)
		{
			gValue = "Queen"; 
		}
		
		else if(fValue == king)
		{
			gValue = "King"; 
		}
		
		else if(fValue == ace)
		{
			gValue = "Ace"; 
		}
		
		return gValue;
		
	}
	
	public String getSuit()
	{
		int whatSuit = (int)(Math.random() * (4));
		String gSuit = "";
		if(whatSuit == clubs)
		{
			gSuit = "Clubs";
		}
		
		else if(whatSuit == diamonds)
		{
			gSuit = "Diamonds";
		}
		else if(whatSuit == spades)
		{
			gSuit = "Spades";
		}
		else if(whatSuit == hearts)
		{
			gSuit = "Hearts";
		}
		return gSuit;
	}
	
	public String read()
	{
		return "This card is a " + value + " of " + suit;
	}
	
	
}
