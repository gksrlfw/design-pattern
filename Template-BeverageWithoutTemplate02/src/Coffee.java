
public class Coffee extends Beverage {
	public void recipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
	private void brewCoffeeGrinds(){
		System.out.println("커피를 내림");
	}
	private void addSugarAndMilk(){
		System.out.println("밀크와 설탕 추가");
	}
}
