import java.util.Random;

public class PlayTest {

	public static void main(String[] args) {
		CardSupply supply=new CardSupply();
		int winnerIndex=0, numberOfPlayers;
		Turn takeTurn;
		Random randomness = new Random();
		
		numberOfPlayers=(randomness.nextInt(2))+2;
		Player[] players = new Player[numberOfPlayers];
		int[] victoryPoints = new int[numberOfPlayers];
		
		while(!supply.endgame())
		{
			for(int i=0; i<numberOfPlayers; i++){
				takeTurn=new Turn(players[i], supply);
				System.out.println("Player "+i+":");
				takeTurn.takeTurn(players[i], players, supply);
			}
		}

		for(int i=0; i<numberOfPlayers; i++){
			victoryPoints[i] = players[i].countPoints();
		}

		for (int i = 1; i < numberOfPlayers; i++) {
		    if (victoryPoints[i] > victoryPoints[winnerIndex]) {
		      winnerIndex = i;
		    }
		}
		
		System.out.println("Player " +winnerIndex+" wins with "+victoryPoints[winnerIndex]+ " points");
	}

}
