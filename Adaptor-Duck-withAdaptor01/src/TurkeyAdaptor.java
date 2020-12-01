
/*
 * Duck�� �������� �ʰ� ����͸� �̿��Ͽ� quack���� turkey�� gobble�� �ҷ��� �� �ִ�
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
