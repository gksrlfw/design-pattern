
/*
 * turkey�� gobble�� ����ϱ� ���ؼ��� �Ʒ�ó�� ��ü�� �����ϰų� �޾ƿͼ� ���� ���� ȣ���ؾ� �Ѵ�
 * ���� ������ Duck Ŭ������ �����ؾ� �Ѵ�
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
