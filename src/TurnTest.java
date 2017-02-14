import static org.junit.Assert.*;

import org.junit.Test;

public class TurnTest {

	@Test
	public void testBuyCards() {
		CardSupply supply = new CardSupply();
		Player player = new Player(supply);
		Turn testPurchase= new Turn(player, supply);
		int previous = player.deckSize(player.discard);
		testPurchase.buyCards(player, supply);
		assert(previous>player.deckSize(player.discard));
		
	}

	@Test
	public void testEndTurn() {
		CardSupply supply = new CardSupply();
		Player player = new Player(supply);
		Turn testEndTurn= new Turn(player, supply);
		int previous = player.deckSize(player.discard);
		testEndTurn.endTurn(player);
		assert(previous>player.deckSize(player.discard));
	}

	@Test
	public void testPlayAction() {
		fail("Not yet implemented");
	}

}
