import java.util.List;
import java.util.Stack;

public class CardSupply {
	Stack<Card> copperSupply= 		new Stack<Card>(); //need 46
	Stack<Card> silverSupply= 		new Stack<Card>(); //need 40
	Stack<Card> goldSupply= 		new Stack<Card>(); //need 30
	Stack<Card> estateSupply = 		new Stack<Card>(); //Need 18
	Stack<Card> duchySupply = 		new Stack<Card>(); //need 12
	Stack<Card> provinceSupply = 	new Stack<Card>(); //need 12
	Stack<Card> curseSupply = 		new Stack<Card>(); //need 10 for 2 players
	Stack<Card> adventurerSupply= 	new Stack<Card>(); //need 10
	Stack<Card> ambassadorSupply= 	new Stack<Card>(); //need 10
	Stack<Card> baronSupply= 		new Stack<Card>(); //need 10
	Stack<Card> councilRoomSupply= 	new Stack<Card>(); //need 10
	Stack<Card> cutPurseSupply= 	new Stack<Card>(); //need 10
	Stack<Card> embargoSupply= 		new Stack<Card>(); //need 10
	Stack<Card> feastSupply= 		new Stack<Card>(); //need 10
	Stack<Card> gardensSupply= 		new Stack<Card>(); //need 10
	Stack<Card> greatHallSupply= 	new Stack<Card>(); //need 10
	Stack<Card> mineSupply= 		new Stack<Card>(); //need 10
	Stack<Card> smithySupply= 		new Stack<Card>(); //need 10
	Stack<Card> villageSupply= 		new Stack<Card>(); //need 10
	Stack<Card> woodcutterSupply= 	new Stack<Card>(); //need 10
	//List<String> kingdomCards=		new List<String>(); //contain kingdom cards used this game
	
	CardSupply(){
		int i;
		
		for(i=0; i<46; i++) copperSupply.push(new Card("copper"));
		for(i=0; i<40; i++) silverSupply.push(new Card("silver"));
		for(i=0; i<30; i++) goldSupply.push(new Card("gold"));
		for(i=0; i<18; i++) estateSupply.push(new Card("estate"));
		for(i=0; i<12; i++) {
			duchySupply.push(new Card("duchy"));
			provinceSupply.push(new Card("province"));
			}
		
		for(i=0; i<10; i++){
			curseSupply.push(new Card("curse"));
			adventurerSupply.push(new Card("adventurer"));
			ambassadorSupply.push(new Card("ambassador"));
			baronSupply.push(new Card("baron"));
			councilRoomSupply.push(new Card("council room"));
			cutPurseSupply.push(new Card("cutpurse"));
			embargoSupply.push(new Card("embargo"));
			feastSupply.push(new Card("feast"));
			gardensSupply.push(new Card("gardens"));
			greatHallSupply.push(new Card("great hall"));
			mineSupply.push(new Card("mine"));
			smithySupply.push(new Card("smithy"));
			villageSupply.push(new Card("village"));
			woodcutterSupply.push(new Card("woodcutter"));
			}
		}			
			
		}
	}

	