import java.util.Stack;

public class Player {
	CardSupply discard, drawPile;
	Stack<Card> hand;
	int handSize, deckSize;
	
	public Player()
	{
		discard=new CardSupply(false);
		drawPile=new CardSupply(false);
		
	}
	
	

}
