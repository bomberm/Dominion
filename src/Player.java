import java.util.ArrayList;
import java.util.List;

public class Player {
	CardSupply discard, drawPile;
	List<Card> hand;
	int deckSize, actions, buys;
	
	public Player()
	{
		discard=new CardSupply(true);
		drawPile=new CardSupply(true);
		drawPile.addCard("copper", 7);
		drawPile.addCard("estate", 3);
		hand=new ArrayList<Card>();
		for(int i=0; i<5; i++)
		{
			hand.add(drawPile.drawCard());
		}
		deckSize=10;
	}
	
	public List<Card> getHand(){
		return hand;
	}
	
	
	
	

}
