// template method
// 바뀌는 부분인 brew, addCondinent를 하위에서 정의하여 코드중복 제거
// 고정된 부분은 final로, 바뀌는 부분은 추상메서드로 만들어 하위에서 반드시 재정의하게 만들어준다
// 이외에 기본 행동이 정해져있고, 하위에서 재정의할 수 있는 hook 메서드가 존재한다
public abstract class Beverage {
	public final void recipe() {
		boilWater();
		brew();
		pourInCup();
		addCondinent();
	}
	private final void boilWater() {
		System.out.println("물을 끓임");
	}
	public abstract void brew();
	private final void pourInCup() {
		System.out.println("컵에 따르다");
	}
	public abstract void addCondinent();
}
