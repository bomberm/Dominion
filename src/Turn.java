import java.util.List;
import java.util.Random;

public class Turn {
	int actions, buys, treasure;
	List<Card> hand;
	
	public Turn(Player player, CardSupply theSupply){
		actions=1;
		buys=1;
		treasure=0;
		
		while(actions > 0){
			playAction(player, theSupply);
			actions--;
		}
		
		while(buys > 0){
			buyCards(player, theSupply);
			buys--;
		}
		
		endTurn();
	}

	private void buyCards(Player player, CardSupply theSupply) {
		String whatCard;
		String pick2[]={"estate", "embargo"};
		String pick3[]={"silver", "ambassador", "great hall", "village", "woodcutter"};
		String pick4[]={"baron", "cutpurse", "feast", "gardens", "smithy"};
		String pick5[]={"council room", "mine"};
		String pick6[]={"gold", "adventurer"};
		Random randomness=new Random();
		
		for(int i=0; i<hand.size(); i++){
			treasure+=player.hand.get(i).worth; //calculate worth.
		}
		
		switch(treasure){
		case 1: //no card costs 1, therefore default to purchasing copper 
		case 0:
			if(theSupply.copper.quantity>0){
				player.discard.addCard("copper");
				player.discardSize++;
			}
			break;
		case 2:
			whatCard = pick2[randomness.nextInt(2)];
			
			player.discard.addCard(whatCard);
			player.discardSize++;
			spend(player.hand, 2);
			break;
		case 3:
			whatCard= buy(theSupply, 3);
			player.discard.addCard(whatCard);
			player.discardSize++;
			spend(player.hand, 3);
			break;
		case 4:
			whatCard=buy(theSupply, 4);
			player.discard.addCard(whatCard);
		default: 
			if(theSupply.province.quantity>0)
				{
				player.discard.addCard("province");
				player.discardSize++;
				spend(player.hand, 8);
				}
		}
		return;
		
	}

	private String buy(CardSupply theSupply, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private void spend(List<Card> hand2, int i) {
		// TODO Auto-generated method stub
		
	}

	private void endTurn() {
		// TODO Auto-generated method stub
		
	}

	private void playAction(Player player, CardSupply theSupply) {
		for(int i=0; i<player.hand.size(); i++) //go through each card in hand.
		{
			if(player.hand.get(i).action){
				actions+=player.hand.get(i).actionsGranted;
				buys+=player.hand.get(i).buysGranted;
				treasure+=player.hand.get(i).worth;
				for(int j=0; j<player.hand.get(i).cardsGranted; j++){
					player.hand.add(player.drawCard());
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
