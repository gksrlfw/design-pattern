
public enum Item {
	Cider(800), Cola(800), Pepsi(800), 
	Pocari(1000), Top(1200), Max(800);
	private static String[] itemNames = {
		"사이다", "콜라", "펩시", "포카리", "티오피", "맥스"
	};
	public final int price;
	private Item(int price) {
		this.price = price;
	}
	@Override public String toString() {
		return itemNames[this.ordinal()];
	}
}
