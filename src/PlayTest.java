

public class PlayTest {

	public static void main(String[] args) {
		Player player1=new Player();
		Player player2=new Player();
		int player1Victory, player2Victory;
		CardSupply supply=new CardSupply(false);
		
		while(!supply.endgame())
		{
			Turn takeTurn=new Turn(player1, supply);
			Turn nextTurn=new Turn(player2, supply);

		}

		player1Victory = player1.countPoints();
		player2Victory = player2.countPoints();
		
		if(player1Victory>player2Victory) System.out.println("Player 1 wins!");
		else System.out.println("Player 2 wins!");


	}

}
