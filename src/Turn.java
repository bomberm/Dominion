import java.util.List;
import java.util.Random;

public class Turn {
	int actions, buys, treasure;
	List<Card> hand;
	
	public Turn(Player player, CardSupply theSupply){
		actions=1;
		buys=1;
		treasure=0;
		
		for(int i=0; i<5; i++){
			hand.add(player.drawCard());
		}
		while(actions > 0){
			playAction(player, theSupply);
			actions--;
		}
		
		while(buys > 0){
			buyCards(player, theSupply);
			buys--;
		}
		
		endTurn(player);
	}

	private void buyCards(Player player, CardSupply theSupply) {
		String whatCard="nothing";
		String pick2[]={"estate", "embargo"};
		String pick3[]={"silver", "ambassador", "great hall", "village", "woodcutter"};
		String pick4[]={"baron", "cutpurse", "feast", "gardens", "smithy"};
		String pick5[]={"council room", "mine"};
		String pick6[]={"gold", "adventurer"};
		Random randomness=new Random();
		
		for(int i=0; i<hand.size(); i++){
			treasure+=hand.get(i).worth; //calculate worth.
		}
		
		switch(treasure){
		case 1: //no card costs 1, therefore default to purchasing copper 
		case 0:
			if(theSupply.copper.quantity>0){
				player.discard.addCard("copper");
				player.discardSize++;
				whatCard="copper";
			}
			break;
		case 2:
			whatCard = pick2[randomness.nextInt(2)];
			if(theSupply.howMany(whatCard)<1) whatCard=pick2[randomness.nextInt(2)];
			player.discard.addCard(whatCard);
			player.discardSize++;
			spend(hand, 2, player);
			break;
		case 3:
			whatCard= pick3[randomness.nextInt(5)];
			if(theSupply.howMany(whatCard)<1){
				for(int i=0; i<5; i++){ //make sure we're not looking forever
					whatCard= pick3[randomness.nextInt(5)];
					if(theSupply.howMany(whatCard)>0) break;
				}					
			}
			player.discard.addCard(whatCard);
			player.discardSize++;
			spend(hand, 3, player);
			break;
		case 4:
			whatCard= pick4[randomness.nextInt(5)];
			if(theSupply.howMany(whatCard)<1){
				for(int i=0; i<5; i++){ //make sure we're not looking forever
					whatCard= pick4[randomness.nextInt(5)];
					if(theSupply.howMany(whatCard)>0) break;
				}					
			}
			player.discard.addCard(whatCard);
			player.discardSize++;
			spend(hand, 3, player);
			break;
		case 5:
			whatCard= pick5[randomness.nextInt(2)];
			if(theSupply.howMany(whatCard)<1){
				for(int i=0; i<5; i++){ //make sure we're not looking forever
					whatCard= pick5[randomness.nextInt(2)];
					if(theSupply.howMany(whatCard)>0) break;
				}					
			}
			player.discard.addCard(whatCard);
			player.discardSize++;
			spend(hand, 5, player);
			break;
		case 6:
			whatCard= pick6[randomness.nextInt(2)];
			if(theSupply.howMany(whatCard)<1){
				for(int i=0; i<5; i++){ //make sure we're not looking forever
					whatCard= pick6[randomness.nextInt(2)];
					if(theSupply.howMany(whatCard)>0) break;
				}					
			}
			player.discard.addCard(whatCard);
			player.discardSize++;
			spend(hand, 6, player);
			break;
		default: 
			if(theSupply.province.quantity>0)
				{
				player.discard.addCard("province");
				player.discardSize++;
				spend(hand, 8, player);
				whatCard="province";
				}
		}
		System.out.println("I purchased "+whatCard);
		return;
		
	}

	private void spend(List<Card> hand2, int i, Player player) {
		for(Card myCard: hand2){
			if(myCard.worth>0){
				i-=myCard.worth;
				player.discard.addCard(myCard.cardType);
				player.discardSize++;
				hand.remove(myCard);
				if(i<1) return;
			}
		}
		
	}

	private void endTurn(Player player) {
		for(Card myCard: hand){
			player.discard.addCard(myCard.cardType);
			player.discardSize++;
			hand.remove(myCard);
		}
		
	}

	private void playAction(Player player, CardSupply theSupply) {
		for(int i=0; i<hand.size(); i++) //go through each card in hand.
		{
			if(hand.get(i).action){
				actions+=hand.get(i).actionsGranted;
				buys+=hand.get(i).buysGranted;
				treasure+=hand.get(i).worth;
				for(int j=0; j<hand.get(i).cardsGranted; j++){
					hand.add(player.drawCard());
					player.deckSize--;
				}
				if(hand.get(i).special) doTheThing(hand.get(i));
				player.discard.addCard(hand.get(i).cardType);
				player.discardSize++;
				System.out.println("I played "+hand.get(i).cardType);
				return;
			}
		}
		System.out.println("I forfitted an action");
		return;
	}

	private void doTheThing(Card card) {
		System.out.println("I do a thing here!");
		
	}
	
	

	
}
