
public class PlayTest {

	public static void main(String[] args) {
		String cards[]={"copper", "silver", "gold", "estate", "duchy", "province", "adventurer", "ambassador", "baron", "council room", "cutpurse", "embargo", "feast", "gardens", "great hall", "mine", "smithy", "village", "woodcutter"};
		
		Card myCards;
		
		for(String c:cards){
			myCards=new Card(c);
			System.out.println(myCards);
		}

	}

}
