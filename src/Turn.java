import java.util.List;

public class Turn {
	int actions, buys, deck, discard;
	List<Card> hand;
	
	public Turn(Player player){
		actions=1;
		buys=1;
		
		while(actions > 0){
			playAction(player);
			actions--;
		}
		
		while(buys > 0){
			buyCards(player);
			buys--;
		}
		
		endTurn();
	}

	private void buyCards(Player player) {
		// TODO Auto-generated method stub
		
	}

	private void endTurn() {
		// TODO Auto-generated method stub
		
	}

	private void playAction(Player player) {
		for(int i=0; i<player.hand.size(); i++) //go through each card in hand.
		{
			if(player.hand.get(i).action){
				actions+=player.hand.get(i).actionsGranted;
				buys+=player.hand.get(i).buysGranted;
				for(int j=0; j<player.hand.get(i).cardsGranted; j++){
					player.hand.add(player.drawPile.drawCard());
					player.deckSize--;
				}
				if(player.hand.get(i).special) doTheThing(player.hand.get(i));
				player.discard.addCard(player.hand.get(i).cardType);
				player.discardSize++;
				return;
			}
		}
		return;
	}

	private void doTheThing(Card card) {
		System.out.println("I do a thing here!");
		
	}
	
	

	
}
