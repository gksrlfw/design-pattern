

// 일반적인 방법
// 비슷하지만 조금 다른 recipe 때문에 코드중복 발생 -> 상위 클래스를 만들어 코드중복을 없애자
public class Coffee {
	public void recipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
	private void boilWater(){
		System.out.println("물을 끓임");
	}
	private void brewCoffeeGrinds(){
		System.out.println("커피를 내림");
	}
	private void pourInCup(){
		System.out.println("컵에 따르다");
	}
	private void addSugarAndMilk(){
		System.out.println("밀크와 설탕 추가");
	}
}
