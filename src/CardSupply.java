import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CardSupply {
	SupplyStack copper, silver, gold, estate, duchy, province, curse, adventurer;
	SupplyStack ambassador, baron, councilRoom, cutPurse, embargo, feast, gardens;
	SupplyStack greatHall, mine, smithy, village, woodcutter;
	List<String> kingdomCards=		new LinkedList<String>(); //contain kingdom cards used this game
	
	CardSupply(Boolean player){
		copper= 	new SupplyStack("copper", (player) ? 0 : 46); //need 46 for supply 
		silver=		new SupplyStack("silver", (player) ? 0: 40); //need 40 for supply
		gold= 		new SupplyStack("gold", (player) ? 0 : 30);//need 30
		estate=		new SupplyStack("estate", (player) ? 0 : 18); //Need 18
		duchy=		new SupplyStack("duchy", (player) ? 0 : 12); //need 12
		province= 	new SupplyStack("province", (player) ? 0 : 12); //need 12
		curse=	 	new SupplyStack("curse", (player) ? 0 : 10); //need 10 for 2 players
		adventurer=	new SupplyStack("adventurer", (player) ? 0 : 10); //need 10
		ambassador=	new SupplyStack("abassador", (player) ? 0 : 10); //need 10
		baron= 		new SupplyStack("baron", (player) ? 0 : 10); //need 10
		councilRoom=new SupplyStack("council room", (player) ? 0 : 10); //need 10
		cutPurse= 	new SupplyStack("cutpurse", (player) ? 0 : 10); //need 10
		embargo= 	new SupplyStack("embargo", (player) ? 0 : 10); //need 10
		feast= 		new SupplyStack("feast", (player) ? 0 : 10); //need 10
		gardens= 	new SupplyStack("gardens", (player) ? 0 : 10); //need 10
		greatHall= 	new SupplyStack("great hall", (player) ? 0 : 10); //need 10
		mine= 		new SupplyStack("mine", (player) ? 0 : 10); //need 10
		smithy= 	new SupplyStack("smithy", (player) ? 0 : 10); //need 10
		village= 	new SupplyStack("village", (player) ? 0 : 10); //need 10
		woodcutter= new SupplyStack("woodcutter", (player) ? 0 : 10); //need 10
		
		if(!player) kingdomCards = selectKingdomCards();
		}
	
	

	private List<String> selectKingdomCards() {
		String cardList[]={"adventurer", "ambassador", "baron", "council room", "cutpurse", "embargo", "feast", "gardens", "great hall", "mine", "smithy", "village", "woodcutter"};
		Random randomness=new Random();
		int index;
		
		while(kingdomCards.size()<10){
			index=randomness.nextInt(13);
			if(!kingdomCards.contains(cardList[index])) kingdomCards.add(cardList[index]);
		}
		
		return null;
	}
	
	public Card drawCard(){
		List<String> choices= new LinkedList<String>();
		String cardTypes[]=copper.type.allCards();
		for(String card : cardTypes){
			choices.add(card);
		}
		Random randomness= new Random();
		int index;
		Card card;

		index=randomness.nextInt(20);
		while(howMany(choices.get(index))<=0){ //Grab different card types until one actually exists in the deck
			index=randomness.nextInt(20);
		}
		card = new Card(choices.get(index));
		removeCard(choices.get(index));
		return card;
		
		}
	
	private void removeCard(String string) {
		switch(string){
		case "copper":
			copper.quantity--;
			return;
		case "silver":
			silver.quantity--;
			return;
		case "gold":
			gold.quantity--;
			return;
		case "estate":
			estate.quantity--;
		case "duchy":
			duchy.quantity--;
			return;
		case "province":
			province.quantity--;
			return;
		case "adventurer":
			adventurer.quantity--;
			return;
		case "ambassador":
			ambassador.quantity--;
			return;
		case "baron":
			baron.quantity--;
			return;
		case "council room":
			councilRoom.quantity--;
			return;
		case "cutpurse":
			cutPurse.quantity--;
			return; 
		case "embargo":
			embargo.quantity--;
			return;
		case "feast":
			feast.quantity--;
			return;
		case "gardens":
			gardens.quantity--;
			return;
		case "great hall":
			greatHall.quantity--;
			return;
		case "mine":
			mine.quantity--;
			return;
		case "smithy":
			smithy.quantity--;
			return;
		case "village":
			village.quantity--;
			return;
		case "woodcutter":
			woodcutter.quantity--;
			return;
		case "curse":
			curse.quantity--;
			return;
		}
		
	}

	public void addCard(String string) {
		switch(string){
		case "copper":
			copper.quantity++;
			return;
		case "silver":
			silver.quantity++;
			return;
		case "gold":
			gold.quantity++;
			return;
		case "estate":
			estate.quantity++;
			return;
		case "duchy":
			duchy.quantity++;
			return;
		case "province":
			province.quantity++;
			return;
		case "adventurer":
			adventurer.quantity++;
			return;
		case "ambassador":
			ambassador.quantity++;
			return;
		case "baron":
			baron.quantity++;
			return;
		case "council room":
			councilRoom.quantity++;
			return;
		case "cutpurse":
			cutPurse.quantity++;
			return; 
		case "embargo":
			embargo.quantity++;
			return;
		case "feast":
			feast.quantity++;
			return;
		case "gardens":
			gardens.quantity++;
			return;
		case "great hall":
			greatHall.quantity++;
			return;
		case "mine":
			mine.quantity++;
			return;
		case "smithy":
			smithy.quantity++;
			return;
		case "village":
			village.quantity++;
			return;
		case "woodcutter":
			woodcutter.quantity++;
			return;
		case "curse":
			curse.quantity++;
			return;
		}
		
	}

	private int howMany(String ofWhat){
		switch(ofWhat){
		case "copper":
			return copper.quantity;
		case "silver":
			return silver.quantity;
		case "gold":
			return gold.quantity;
		case "estate":
			return estate.quantity;
		case "duchy":
			return duchy.quantity;
		case "province":
			return province.quantity;
		case "adventurer":
			return adventurer.quantity;
		case "ambassador":
			return ambassador.quantity;
		case "baron":
			return baron.quantity;
		case "council room":
			return councilRoom.quantity;
		case "cutpurse":
			return cutPurse.quantity; 
		case "embargo":
			return embargo.quantity;
		case "feast":
			return feast.quantity;
		case "gardens":
			return gardens.quantity;
		case "great hall":
			return greatHall.quantity;
		case "mine":
			return mine.quantity;
		case "smithy":
			return smithy.quantity;
		case "village":
			return village.quantity;
		case "woodcutter":
			return woodcutter.quantity;
		case "curse":
			return curse.quantity;
		}
		
		return 0;

	}
			
	public String toString(){
		String returnString="";
		String theList[]=curse.type.allCards();
		
		for(String eachCard : theList){
			returnString+=eachCard+" has: "+howMany(eachCard)+" cards currently\n";
		}
		
		return returnString;
		}

	public void addCard(String string, int i) {
		switch(string){
		case "copper":
			copper.quantity+=i;
			return;
		case "silver":
			silver.quantity+=i;
			return;
		case "gold":
			gold.quantity+=i;
			return;
		case "estate":
			estate.quantity+=i;
			return;
		case "duchy":
			duchy.quantity+=i;
			return;
		case "province":
			province.quantity+=i;
			return;
		case "adventurer":
			adventurer.quantity+=i;
			return;
		case "ambassador":
			ambassador.quantity+=i;
			return;
		case "baron":
			baron.quantity+=i;
			return;
		case "council room":
			councilRoom.quantity+=i;
			return;
		case "cutpurse":
			cutPurse.quantity+=i;
			return; 
		case "embargo":
			embargo.quantity+=i;
			return;
		case "feast":
			feast.quantity+=i;
			return;
		case "gardens":
			gardens.quantity+=i;
			return;
		case "great hall":
			greatHall.quantity+=i;
			return;
		case "mine":
			mine.quantity+=i;
			return;
		case "smithy":
			smithy.quantity+=i;
			return;
		case "village":
			village.quantity+=i;
			return;
		case "woodcutter":
			woodcutter.quantity+=i;
			return;
		case "curse":
			curse.quantity+=i;
			return;
		
		}
	}
}
	