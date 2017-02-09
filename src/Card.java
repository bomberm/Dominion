
public class Card {
	int cost, worth, actionsGranted, buysGranted, cardsGranted, victoryPoints, embargoTokens;
	boolean special;

	public Card(String type)
	{
		switch(type){
			case "copper":
				makeCopper(this);
				break;
			case "silver":
				makeSilver(this);
				break;
			case "gold":
				makeGold(this);
				break;
			case "estate":
				makeEstate(this);
				break;
			case "duchy":
				makeDuchy(this);
				break;
			case "province":
				makeProvince(this);
				break;
			case "adventurer":
				makeAdventurer(this);
				break;
			case "ambassador":
				makeAmbassador(this);
				break;
			case "baron":
				makeBaron(this);
				break;
			case "council room":
				makeCouncilRoom(this);
				break;
			case "cutpurse":
				makeCutpurse(this);
				break;
			case "embargo":
				makeEmbargo(this);
				break;
			case "feast":
				makeFeast(this);
				break;
			case "gardens":
				makeGardens(this);
				break;
			case "great hall":
				makeGreatHall(this);
				break;
			case "mine":
				makeMine(this);
				break;
			case "smithy":
				makeSmithy(this);
				break;
			case "village":
				makeVillage(this);
				break;
			case "woodcutter":
				makeWoodcutter(this);
				break;
			}
		embargoTokens=0;
		
		}
	private void makeMine(Card card) {
		card.cost=5;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=true; //trash a treasure card, gain a treasure card costing up to 3 more put it in your hand 
		return;
		
	}
	private void makeGreatHall(Card card) {
		card.cost=3;
		card.worth=0;
		card.actionsGranted=1;
		card.buysGranted=0;
		card.cardsGranted=1;
		card.victoryPoints=1;
		special=false;  
		return;	
		
	}
	private void makeGardens(Card card) {
		card.cost=4;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=true; //worth 1 vp for every 10 cards in deck, (rounded down) 
		return;	
		
	}
	private void makeFeast(Card card) {
		card.cost=4;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=true; //Trash this card. Gain a card costing up to 5 gold 
		return;	
		
	}
	private void makeEmbargo(Card card) {
		card.cost=2;
		card.worth=2;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=true; //trash this card, put embargo token on the top of a supply pile/ When a player buys a card, he gains a curse card per embargo token on that pile 
		return;	
		
	}
	private void makeCutpurse(Card card) {
		card.cost=4;
		card.worth=2;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=true; //Each other player discards a Copper card (or reveals a hand with no Copper)
		return;	
		
	}
	private void makeBaron(Card card) {
		card.cost=4;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=1;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=true; //You may discard an estate card and gain +4, or gain an estate card
		return;	
		
	}
	private void makeAmbassador(Card card) {
		card.cost=3;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=true; //reveal a card from your hand, return up to 2 copies of it from your hand to the Supply, then each other player gains a copy of it /dead/
		return;	
		
	}
	private void makeWoodcutter(Card card) {
		card.cost=3;
		card.worth=2;
		card.actionsGranted=0;
		card.buysGranted=1;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=false;
		return;	
		
	}
	private void makeVillage(Card card) {
		card.cost=3;
		card.worth=0;
		card.actionsGranted=2;
		card.buysGranted=0;
		card.cardsGranted=1;
		card.victoryPoints=0;
		special=false;
		return;	
		
	}
	private void makeSmithy(Card card) {
		card.cost=4;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=3;
		card.victoryPoints=0;
		special=false;
		return;	
		
	}
	
	private void makeCouncilRoom(Card card) {
		card.cost=5;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=1;
		card.cardsGranted=4;
		card.victoryPoints=0;
		special=true; //each other player draws a card
		return;	
		
	}

	private void makeAdventurer(Card card) {
		card.cost=8;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=6;
		special=false;
		return;	
		
	}
	private void makeProvince(Card card) {
		card.cost=8;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=6;
		special=false;
		return;	
		
	}
	private void makeDuchy(Card card) {
		card.cost=5;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=3;
		special=false;
		return;	
		
	}
	private void makeEstate(Card card) {
		card.cost=2;
		card.worth=0;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=1;
		special=false;
		return;	
		
	}

	private void makeGold(Card card) {
		card.cost=6;
		card.worth=3;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=false;
		return;		
	}

	private void makeSilver(Card card) {
		card.cost=3;
		card.worth=2;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=false;
		return;
		
	}

	private void makeCopper(Card card) {
		card.cost=0;
		card.worth=1;
		card.actionsGranted=0;
		card.buysGranted=0;
		card.cardsGranted=0;
		card.victoryPoints=0;
		special=false;
		return;		
		
	}
}