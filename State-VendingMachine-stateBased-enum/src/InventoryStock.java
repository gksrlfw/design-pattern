import java.util.EnumMap;
import java.util.Map;

public class InventoryStock {
	private Map<Item, Integer> stock = new EnumMap<>(Item.class);
	{
		for(var item: Item.values()) stock.put(item, 0);
	}
	int numberOfItems = 0;
	public InventoryStock() {}
	public boolean isEmpty() {
		return numberOfItems == 0;
	}
	public void clear() {
		for(var item: Item.values())
			stock.put(item, 0);
		numberOfItems = 0;
	}
	public void addItem(Item item, int amount) {
		if(amount<=0) throw new IllegalArgumentException();
		int currentAmount = stock.get(item);
		stock.put(item, currentAmount+amount);
		numberOfItems += amount;
	}
	public void setItem(Item item, int amount) {
		if(amount<0) throw new IllegalArgumentException();
		int currentAmount = stock.get(item);
		stock.put(item, amount);
		numberOfItems += amount-currentAmount;
	}
	public void removeItem(Item item) {
		int currentAmount = stock.get(item);
		if(currentAmount>0)
			stock.put(item, currentAmount-1);
		else throw new IllegalStateException();
		--numberOfItems;
	}
	// 
	public int getNumberOfAllItems() {
		return numberOfItems;
	}
	public int getNumberOfItems(Item item) {
		return stock.get(item);
	}
	public int minPrice() {
		return stock.entrySet().stream().filter(entry->entry.getValue()>0)
			.map(entry->entry.getKey().price).min(Integer::compare).get();
	}
	public void debugPrint() {
		for(var item: stock.entrySet()) {
			System.out.println(item.getKey()+": "+item.getValue());
		}
	}
}
