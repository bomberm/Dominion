

public class PlayTest {

	public static void main(String[] args) {
		Player player1=new Player();
		Player player2=new Player();
		CardSupply supply=new CardSupply(false);
		
		while(!supply.endgame())
		{
			Turn takeTurn=new Turn(player1, supply);
			Turn takeTurn=new Turn(player2, supply)
		}
		
		
		System.out.println(player);
		


	}

}
