

// ������ recipe�� ���� �ڵ��ߺ� ������ �߻��� -> recipe�� �����ϰ� ���ο� �ٲ�� �κ��� �߻�޼���� �ٲ���
public abstract class Beverage {
	public abstract void recipe();
	public void boilWater() {
		System.out.println("���� ����");
	}
	public void pourInCup() {
		System.out.println("�ſ� ������");
	}
}
