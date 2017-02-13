import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Turn {
	int actions, buys, treasure;
	List<Card> hand;
	
	public Turn(Player player, CardSupply theSupply){
		actions=1;
		buys=1;
		treasure=0;
		hand= new LinkedList<Card>();
		
		for(int i=0; i<5; i++){
			hand.add(player.drawCard());
		}

	}

	private void buyCards(Player player, CardSupply theSupply) {
		String whatCard="nothing";
		String pick2[]={"estate", "embargo"};
		String pick3[]={"silver", "ambassador", "great hall", "village", "woodcutter"};
		String pick4[]={"baron", "cutpurse", "feast", "gardens", "smithy"};
		String pick5[]={"council room", "mine"};
		String pick6[]={"gold", "adventurer"};
		Random randomness=new Random();
		
		switch(treasure){
		case 1: //no card costs 1, therefore default to purchasing copper 
		case 0:
			if(theSupply.copper.quantity>0){
				player.discard.addCard("copper");
				theSupply.removeCard("copper");
				whatCard="copper";
			}
			break;
		case 2:
			whatCard = pick2[randomness.nextInt(2)];
			if(theSupply.howMany(whatCard)<1) whatCard=pick2[randomness.nextInt(2)];
			player.discard.addCard(whatCard);
			theSupply.removeCard(whatCard);
			spend(2, player);
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
			theSupply.removeCard(whatCard);
			spend(3, player);
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
			theSupply.removeCard(whatCard);
			spend(3, player);
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
			theSupply.removeCard(whatCard);
			spend(5, player);
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
			theSupply.removeCard(whatCard);
			spend(6, player);
			break;
		default: 
			if(theSupply.province.quantity>0)
				{
				player.discard.addCard("province");
				theSupply.removeCard("province");
				spend(8, player);
				whatCard="province";
				}
		}
		System.out.println("I purchased "+whatCard);
		return;
		
	}

	private void spend(int i, Player player) {
		ListIterator<Card> iterator = hand.listIterator();
		Card myCard;
		while(iterator.hasNext()){
			myCard=iterator.next();
			if(myCard.worth>0){
				i-=myCard.worth;
				player.discard.addCard(myCard.cardType);
				
				if(i<1) return;
			}
		}
		
	}

	private void endTurn(Player player) {
		for(int i=0; i<hand.size(); i++){
			player.discard.addCard(hand.get(i).cardType);
			
		}
		
	}
	public void takeTurn(Player player, CardSupply theSupply){
		while(actions > 0){
			playAction(player, theSupply);
			actions--;
		}
		
		for(int i=0; i<hand.size(); i++){
			treasure+=hand.get(i).worth; //calculate worth.
		}
		
		while(buys > 0){
			System.out.println("Buying!");
			buyCards(player, theSupply);
			buys--;
		}
		
		endTurn(player);
		
	}

	private void playAction(Player player, CardSupply theSupply) {
		for(int i=0; i<hand.size(); i++) //go through each card in hand.
		{
			if(hand.get(i).action){
				System.out.println("I found an action! It's called "+hand.get(i).cardType);
				actions+=hand.get(i).actionsGranted;
				System.out.println("I now have added "+ hand.get(i).actionsGranted+" actions");
				buys+=hand.get(i).buysGranted;
				treasure+=hand.get(i).worth;
				for(int j=0; j<hand.get(i).cardsGranted; j++){
					hand.add(player.drawCard());
				}
				if(hand.get(i).special) doTheThing(hand.get(i));
				player.discard.addCard(hand.get(i).cardType);
				
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
