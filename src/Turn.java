import java.util.ArrayList;
import java.util.List;

public class Turn {
	int actions, buys;
	List<Card> hand;
	
	public Turn(List<Card> hand){
		actions=1;
		buys=1;
		this.hand=new ArrayList<Card>();
		this.hand=hand;
	}

	
}
