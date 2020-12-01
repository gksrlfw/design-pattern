
public enum Currency {
	C10(10), C50(50), C100(100), C500(500), P1000(1000), 
	P5000(5000), P10000(10000);
	public final int value;
	private Currency(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return String.format("%,d원", value);
	}
}
