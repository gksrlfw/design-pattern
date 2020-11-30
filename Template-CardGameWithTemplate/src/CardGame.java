// cardGame 아래에 3개의 게임이 존재하는데 카드를 받는 갯수에 따라 달라진다. 따라서 이를 바뀌는 부분으로 하여 추상 메서드로 만들고
// 이외의 전체 카드 갯수는 고정되어 있으니 init, 셔플 방법은 다를 수 있으니 hook으로 정의할 수 있다 
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.Set;

public abstract class CardGame {
	public static final int TOTALNUMBEROFCARDS = 52;
	public final int NUMBEROFCARDSPERPLAYER;
	private ArrayList<Card> originalDeck 
		= new ArrayList<>(TOTALNUMBEROFCARDS+2);
	protected Queue<Card> remainingDeck = new ArrayDeque<>();
	protected ArrayList<ArrayList<Card>> userCards = new ArrayList<>();
	protected int numberOfPlayers;
	
	public CardGame(int numberOfCardsPerPlayer) {
		if(numberOfCardsPerPlayer<0||numberOfCardsPerPlayer>TOTALNUMBEROFCARDS)
			throw new IllegalArgumentException("사용자마다 나누어 주는 카드 수가 잘못 설정");
		NUMBEROFCARDSPERPLAYER = numberOfCardsPerPlayer;
	}
	// 탬플릿 메소드
	public final void init(int numberOfPlayers){
		setNumberOfPlayers(numberOfPlayers);
		originalDeck.clear();
		remainingDeck.clear();
		userCards.clear();
		CardFace[] cardFaces = CardFace.values();
//		52장 혹은 54장을 넣는다
		for(int i=0; i<TOTALNUMBEROFCARDS; i++){
			originalDeck.add(new Card(i % 13 + 1, cardFaces[i/13]));
		}
		if(needJokerCards()) {
			originalDeck.add(new Card(0, CardFace.SPADES));
			originalDeck.add(new Card(0, CardFace.DIAMONDS));
		}
		shuffle();
		remainingDeck.addAll(originalDeck);
		dealCards();
	}
	// hook: 원하면 섞는 알고리즘을 변경할 수 있음
	protected void shuffle(){
		 Collections.shuffle(originalDeck);
	}
	// hook: 원하면 조커 카드를 추가할 수 있음
	protected boolean needJokerCards() {
		return false;
	}
	// Concrete Method
	private void setNumberOfPlayers(int numberOfPlayers) {
		if(numberOfPlayers<=0 || numberOfPlayers>=TOTALNUMBEROFCARDS/NUMBEROFCARDSPERPLAYER)
			throw new IllegalArgumentException("플레이어 수가 적절하지 않음");
		this.numberOfPlayers = numberOfPlayers;
	}
	// Abstract Method
	// 카드를 각 플레이어에게 나누어주기
	protected abstract void dealCards();
	public Card getCard() {
        return remainingDeck.poll();
    }
	public ArrayList<ArrayList<Card>> getUserCards(){
		return userCards;
	}
	public void display() {
		for(var cards: userCards) {
			for(var card: cards) {
				System.out.print(card+", ");
			}
			System.out.println();
		}
	}
}
