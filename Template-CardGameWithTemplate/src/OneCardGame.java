import java.util.ArrayList;

/**
 * 학번: 2015136061
 * 학부: 컴퓨터공학부
 * 성명: 서한길
 */
public class OneCardGame extends CardGame {
	public OneCardGame() {
		super(7);
	}
	@Override
	protected void dealCards() {
		for(int i=0; i<numberOfPlayers; i++) {
			ArrayList<Card> user = new ArrayList<>();
			for(int j=0; j<7; j++)
				user.add(remainingDeck.poll());
			userCards.add(user);
		}
	}
	@Override
	protected boolean needJokerCards() {
		return true;
	}
}
