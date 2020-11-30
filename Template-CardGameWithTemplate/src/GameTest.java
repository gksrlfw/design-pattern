
public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardGame blackJack = new BlackJackGame();
		CardGame poker = new PokerGame();
		CardGame oneCard = new OneCardGame();
		
		blackJack.init(2);
		blackJack.shuffle();
		blackJack.display();
		
		poker.init(2);
		poker.shuffle();
		poker.display();
		
		oneCard.init(2);
		oneCard.shuffle();
		oneCard.display();
	}
}
