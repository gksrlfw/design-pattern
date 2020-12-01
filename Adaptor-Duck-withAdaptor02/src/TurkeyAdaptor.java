
/*
 * 클래스 어댑터 : 어댑티를 상속받아 구현한다. 구현이 좀 더 간결하지만 클라이언트가 클래스면 다중상속이 지원안되므로 구현할 수 없다
 * 
 */
public class TurkeyAdaptor extends Turkey implements Duck {
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		gobble();
	}
	@Override
	public void flyingDuck() {
		// TODO Auto-generated method stub
		flyingTurkey();
	}
	
}
