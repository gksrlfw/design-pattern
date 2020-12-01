
/*
 * Duck을 수정하지 않고 어댑터를 이용하여 quack으로 turkey의 gobble을 불러올 수 있다
 * 
 */
public class TurkeyAdaptor implements Duck {
	private Turkey turkey;
	public TurkeyAdaptor(Turkey turkey) {
		this.turkey = turkey;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}
	@Override
	public void flyingDuck() {
		// TODO Auto-generated method stub
		turkey.flyingTurkey();
	}
	
}
