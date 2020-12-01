
public class InsertedCash {
	private Currency currency;
	private int amount = 0;
	public InsertedCash() {}
	public void setMoney(Currency currency) {
		this.currency = currency;
	}
	public void setAmount(int amount) {
		if(amount<0) throw new IllegalArgumentException();
		this.amount = amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public int getAmount() {
		return amount;
	}
}
