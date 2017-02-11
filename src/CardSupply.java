import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CardSupply {
	SupplyStack copperSupply, silverSupply, goldSupply, estateSupply, duchySupply, provinceSupply, curseSupply, adventurerSupply;
	SupplyStack ambassadorSupply, baronSupply, councilRoomSupply, cutPurseSupply, embargoSupply, feastSupply, gardensSupply;
	SupplyStack greatHallSupply, mineSupply, smithySupply, villageSupply, woodcutterSupply;
	List<String> kingdomCards=		new LinkedList<String>(); //contain kingdom cards used this game
	
	CardSupply(){
		copperSupply= 		new SupplyStack("copper", 46); //need 46
		silverSupply= 		new SupplyStack("silver", 40); //need 40
		goldSupply= 		new SupplyStack("gold", 30);//need 30
		estateSupply = 		new SupplyStack("estate", 18); //Need 18
		duchySupply = 		new SupplyStack("duchy", 12); //need 12
		provinceSupply = 	new SupplyStack("province", 12); //need 12
		curseSupply = 		new SupplyStack("curse", 10); //need 10 for 2 players
		adventurerSupply= 	new SupplyStack("adventurer", 10); //need 10
		ambassadorSupply= 	new SupplyStack("abassador", 10); //need 10
		baronSupply= 		new SupplyStack("baron", 10); //need 10
		councilRoomSupply= 	new SupplyStack("council room", 10); //need 10
		cutPurseSupply= 	new SupplyStack("cutpurse", 10); //need 10
		embargoSupply= 		new SupplyStack("embargo", 10); //need 10
		feastSupply= 		new SupplyStack("feast", 10); //need 10
		gardensSupply= 		new SupplyStack("gardens", 10); //need 10
		greatHallSupply= 	new SupplyStack("great hall", 10); //need 10
		mineSupply= 		new SupplyStack("mine", 10); //need 10
		smithySupply= 		new SupplyStack("smithy", 10); //need 10
		villageSupply= 		new SupplyStack("village", 10); //need 10
		woodcutterSupply= 	new SupplyStack("woodcutter", 10); //need 10
		
		kingdomCards = selectKingdomCards();
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
			
	}

	