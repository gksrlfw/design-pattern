// template method
// �ٲ�� �κ��� brew, addCondinent�� �������� �����Ͽ� �ڵ��ߺ� ����
// ������ �κ��� final��, �ٲ�� �κ��� �߻�޼���� ����� �������� �ݵ�� �������ϰ� ������ش�
// �̿ܿ� �⺻ �ൿ�� �������ְ�, �������� �������� �� �ִ� hook �޼��尡 �����Ѵ�
public abstract class Beverage {
	public final void recipe() {
		boilWater();
		brew();
		pourInCup();
		addCondinent();
	}
	private final void boilWater() {
		System.out.println("���� ����");
	}
	public abstract void brew();
	private final void pourInCup() {
		System.out.println("�ſ� ������");
	}
	public abstract void addCondinent();
}
