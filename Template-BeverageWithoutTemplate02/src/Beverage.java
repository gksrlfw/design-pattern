

// 여전히 recipe에 대한 코드중복 문제가 발생함 -> recipe를 고정하고 내부에 바뀌는 부분을 추상메서드로 바꾸자
public abstract class Beverage {
	public abstract void recipe();
	public void boilWater() {
		System.out.println("물을 끓임");
	}
	public void pourInCup() {
		System.out.println("컵에 따르다");
	}
}
