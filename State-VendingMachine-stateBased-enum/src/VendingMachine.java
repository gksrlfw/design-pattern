import java.util.Map;


public class VendingMachine {
	// 자판기 보유 재고
	private InventoryStock inventoryStock = new InventoryStock();
	// 자판기 보유 현금
	private CashRegister cashRegister = new CashRegister();
	// 고객이 투입한 현금
	private CashRegister userCashRegister = new CashRegister();
	// 마지막 테스트의 마지막 부분에서 제품이 한 개도 없는 상태에서(soldout 상태) 돈을 받으면 그 금액이 누적되었다가 한번에 추가되는것 같아서 이를 위한 객체를 따로 선언했습니다.
	private CashRegister userCashRegisterWithSoldOut = new CashRegister();	
	
	private MachineState currentState = MachineState.noMoney;
	
	// InventoryStock 상호작용
	public boolean isEmpty() {
		return inventoryStock.isEmpty();
	}
	public int getNumberOfItems(Item item) {
		return inventoryStock.getNumberOfItems(item);
	}
	public void clearItems() {
		inventoryStock.clear();
		currentState = MachineState.soldOut;
	}
	public void addItemInventoryStock(Item item, int amount) {
		inventoryStock.addItem(item, amount);
	}
	
	public void removeItem(Item item) {
		inventoryStock.removeItem(item);
	}
	public int getNumberOfAllItems() {
		return inventoryStock.getNumberOfAllItems();
	}
	
	
	// 현재 재고가 있는 제품 중 가장 저렴한 제품의 가격
	public int minPrice() {
		return inventoryStock.minPrice();
	}
	// cashRegister 상호작용	
	public int getBalance() {
		return cashRegister.getBalance();
	}
	public void setCash(Currency currency, int amount) {
		cashRegister.set(currency, amount);
	}
	public int getAmount(Currency currency) {
		return cashRegister.getAmount(currency);
	}
	
	// userCashRegister 상호작용
	public int getInsertedBalance() {
		return userCashRegister.getBalance();
	}
	public void setUserCashRegister(CashRegister changeRegister) {
		userCashRegister = changeRegister;
	}
	// 실제 투입된 돈을 처리하는 메소드
	// 고객이 투입한 돈은 자판기 보유 돈에도 포함하여 처리함
	public void addCash(Currency currency, int amount) {
		userCashRegister.add(currency, amount);
		cashRegister.add(currency, amount);
	}
	public void changeState(MachineState nextState) {
		this.currentState = nextState;
	}
	
	// 과제를 해결하기 위해 만든 메서드
	public CashRegister getCashRegister() {
		return cashRegister;
	}
	public CashRegister getUserCashRegister() {
		return userCashRegister;
	}
	public CashRegister getChanges(int changeAmount) {
		return cashRegister.getChange(changeAmount);
	}
	public void userCashRegisterClear() {
		userCashRegister.clear();
	}
	public void cancelUserMoney(Currency currency, int amount) {
		cashRegister.remove(currency, amount);
		userCashRegister.remove(currency, amount);
	}
	public void afterSelectedItemInUser(Currency currency, int amount) {
		userCashRegister.add(currency, amount);
	}
	// soldOut 되었을 때는 따로 저장
	public void addUserCashWithSoldOut(Currency currency, int amount) {
		userCashRegisterWithSoldOut.add(currency, amount);
	}
	public void addCashWithSoldOut() {
		for(Map.Entry<Currency, Integer> entry : userCashRegisterWithSoldOut.getRegister().entrySet()) {
			if(entry.getValue() == 0) continue;
			cashRegister.add(entry.getKey(), entry.getValue());
		}
	}
	
	
	// vendingMachine 자체와 상호작용
	public void insertCash(Currency currency, int amount){
		currentState.insertCash(this, currency, amount);
	}
	public void selectItem(Item item) throws ChangeNotAvailableException {
		currentState.selectItem(this, item);
		currentState.dispenseItem(this, item);
	}
	public void cancel() {
		currentState.cancel(this);
	}
	public void supplementItems(Item item, int amount) {
		if(currentState == MachineState.soldOut) currentState.supplementItems(this, item, amount);
		else inventoryStock.addItem(item, amount);
	}

	public void debugPrint() {
		System.out.println("=========================");
		cashRegister.debugPrint();
		inventoryStock.debugPrint();
	}
}
