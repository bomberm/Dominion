import java.util.List;
import java.util.Stack;

public class makeGameSpace {
	List<Card> copperSupply= 		new Stack<Card>(); //need 46
	List<Card> silverSupply= 		new Stack<Card>(); //need 40
	List<Card> goldSupply= 			new Stack<Card>(); //need 30
	List<Card> estateSupply = 		new Stack<Card>(); //Need 18
	List<Card> duchySupply = 		new Stack<Card>(); //need 12
	List<Card> provinceSupply = 	new Stack<Card>(); //need 12
	List<Card> curseSupply = 		new Stack<Card>(); //need 10 for 2 players
	List<Card> adventurerSupply= 	new Stack<Card>(); //need 10
	List<Card> ambassadorSupply= 	new Stack<Card>(); //need 10
	List<Card> baronSupply= 		new Stack<Card>(); //need 10
	List<Card> councilRoomSupply= 	new Stack<Card>(); //need 10
	List<Card> cutPurseSupply= 		new Stack<Card>(); //need 10
	List<Card> embargoSupply= 		new Stack<Card>(); //need 10
	List<Card> feastSupply= 		new Stack<Card>(); //need 10
	List<Card> gardensSupply= 		new Stack<Card>(); //need 10
	List<Card> greatHallSupply= 	new Stack<Card>(); //need 10
	List<Card> mineSupply= 			new Stack<Card>(); //need 10
	List<Card> smithySupply= 		new Stack<Card>(); //need 10
	List<Card> villageSupply= 		new Stack<Card>(); //need 10
	List<Card> woodcutterSupply= 	new Stack<Card>(); //need 10
	
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
	}
		}

	