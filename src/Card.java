
public class Card {
	int cost, worth, actionsGranted, buysGranted, cardsGranted, victoryPoints;
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
			case "bureaucrat":
				makeBureaucrat(this);
				break;
			case "cellar":
				makeCellar(this);
				break;
			case "chancellor":
				makeChancellor(this);
				break;
			case "chapel":
				makeChapel(this);
				break;
			case "council room":
				makeCouncilRoom(this);
				break;
			case "feast":
				makeFeast(this);
				break;
			case "festival":
				makeFestival(this);
				break;
			case "gardens":
				makeGardens(this);
				break;
			case "laboratory":
				makeLab(this);
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
		}
	private void makeWoodcutter(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeVillage(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeSmithy(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeLab(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeGardens(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeFestival(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeFeast(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeCouncilRoom(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeChapel(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeChancellor(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeCellar(Card card) {
		// TODO Auto-generated method stub
		
	}
	private void makeBureaucrat(Card card) {
		// TODO Auto-generated method stub
		
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