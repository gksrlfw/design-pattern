
/*
 * turkey의 gobble을 사용하기 위해서는 아래처럼 객체를 유지하거나 받아와서 통해 직접 호출해야 한다
 * 따라서 기존의 Duck 클래스를 수정해야 한다
 */
public class Duck {
	private Turkey t;
	public Duck(Turkey t) {
		this.t = t;
	}
	public void quack() {
		t.gobble();
	}
	public void flyingDuck() {
		t.flyingTurkey();
	}
}
