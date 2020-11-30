
public class Card{
	private final int number;
    private final CardFace face;
    public Card(int number, CardFace face){
    	if(number>=0&&number<=13) this.number = number;
		else throw new IllegalArgumentException();
        this.face = face;
    }
    public int getNumber(){
        return number;
    }
    public CardFace getFace(){
        return face;
    }
    @Override
    public String toString(){
    	return String.format("%d %s", number, face);
    }
}
