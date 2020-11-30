import java.util.ArrayList;

/**
 * 학번: 2015136061
 * 학부: 컴퓨터공학부
 * 성명: 서한길
 */
public class PokerGame extends CardGame {
	public PokerGame() {
		super(5);
	}
	@Override
	protected void dealCards() {
		for(int i=0; i<numberOfPlayers; i++) {
			ArrayList<Card> user = new ArrayList<>();
			for(int j=0; j<5; j++)
				user.add(remainingDeck.poll());
			userCards.add(user);
		}
	}
}
