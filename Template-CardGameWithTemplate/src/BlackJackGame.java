import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;

public class BlackJackGame extends CardGame {
	public BlackJackGame() {
		super(2);
	}
	@Override
	protected void dealCards() {
		for(int i=0; i<numberOfPlayers; i++) {
			ArrayList<Card> user = new ArrayList<>();
			for(int j=0; j<2; j++)
				user.add(remainingDeck.poll());
			userCards.add(user);
		}
	}
}
