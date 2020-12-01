/*
 * 상태기반전이
 * 기본적으로 상태에 따라 행위가 달라지는지 확인하고, 상태 다이어그램을 작성한다 
 */


import java.util.Map;

public enum MachineState {
	noMoney {	
		public void insertCash(VendingMachine vm, Currency currency, int amount) {
			vm.addCash(currency, amount);
			vm.changeState(hasMoney);
		}
	},
	hasMoney {
		public void insertCash(VendingMachine vm, Currency currency, int amount) {
			vm.addCash(currency, amount);
		}
		// 잔돈을 반납한 후, noMoney 상태로 간다 
		public void cancel(VendingMachine vm) {
			Map<Currency, Integer> tempRegister = vm.getUserCashRegister().getRegister();
			for(Map.Entry<Currency, Integer> entry : tempRegister.entrySet()) {
				if(entry.getValue() == 0) continue;
				vm.cancelUserMoney(entry.getKey(), entry.getValue());
			}
			vm.changeState(noMoney);
		}
		// 선택한 제품보다 돈이 많을 때, 잔돈을 줄 수 있을 때 제품을 제공한다 
		public void selectItem(VendingMachine vm, Item item) throws ChangeNotAvailableException {
			int changes = vm.getInsertedBalance() - item.price;
			if(changes<0 || vm.getNumberOfItems(item) == 0) { throw new ChangeNotAvailableException("돈을 더 넣으세요"); }	// 제품 가격이 더 비싼경우 -> 다시 hasMoney 상태로
			CashRegister temp = vm.getChanges(changes);
			if(temp.getBalance() == 0) { cancel(vm); throw new ChangeNotAvailableException("잔돈이 부족합니다");}  

			// 제품 선택이 가능하면 거슬러 줄 돈을 저장한 뒤, sold 상태로 간다
			vm.userCashRegisterClear();
			Map<Currency, Integer> tempRegister = temp.getRegister();
			for(Map.Entry<Currency, Integer> entry : tempRegister.entrySet()) {
				if(entry.getValue() == 0) continue;
				vm.afterSelectedItemInUser(entry.getKey(), entry.getValue());
			}
			vm.changeState(sold);
		}
		
	},
	sold {
		// 잔돈을 주고 noMoney 상태로 간다
		public void cancel(VendingMachine vm) {
			Map<Currency, Integer> tempRegister = vm.getUserCashRegister().getRegister();
			for(Map.Entry<Currency, Integer> entry : tempRegister.entrySet()) {
				if(entry.getValue() == 0) continue;
				vm.cancelUserMoney(entry.getKey(), entry.getValue());
			}
			vm.changeState(noMoney);
		}
		
		// 제품을 제공하는 역할만 한다
		// 제품을 제공하고 한 개의 제품도 없으면 soldOut, 남아있는 돈이 부족하면 cancel, 아니면 hasMoney로 간다
		public void dispenseItem(VendingMachine vm, Item item) {
			vm.removeItem(item);
			if(vm.getNumberOfAllItems() == 0) { cancel(vm); vm.changeState(soldOut); }
			else if(vm.getInsertedBalance() == 0 || vm.minPrice() > vm.getInsertedBalance()) cancel(vm);
			else vm.changeState(hasMoney);
		}
	},
	soldOut {
		// soldOut 상태일 때, 유저가 투입한 돈은 따로 저장하여 supplementItems가 되면 한번에 지급하도록 한다
		public void insertCash(VendingMachine vm, Currency currency, int amount) {
			vm.addUserCashWithSoldOut(currency, amount);
		}
		
		// 제품을 추가하고 유저가 soldOut 상태일 때 넣은 돈을 머신과 유저에 넣는다
		public void supplementItems(VendingMachine vm, Item item, int amount) {
			vm.addItemInventoryStock(item, amount);
			vm.addCashWithSoldOut();
			if(vm.getInsertedBalance() == 0) vm.changeState(noMoney);
			else vm.changeState(hasMoney);
		}
	};
	public void insertCash(VendingMachine vm, Currency currency, int amount) {}
	public void selectItem(VendingMachine vm, Item item) throws ChangeNotAvailableException {}
	public void dispenseItem(VendingMachine vm, Item item) {}
	public void cancel(VendingMachine vm) {}
	public void supplementItems(VendingMachine vm, Item item, int amount) {}
	
}
