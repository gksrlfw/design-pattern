

// �Ϲ����� ���
// ��������� ���� �ٸ� recipe ������ �ڵ��ߺ� �߻� -> ���� Ŭ������ ����� �ڵ��ߺ��� ������
public class Coffee {
	public void recipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
	private void boilWater(){
		System.out.println("���� ����");
	}
	private void brewCoffeeGrinds(){
		System.out.println("Ŀ�Ǹ� ����");
	}
	private void pourInCup(){
		System.out.println("�ſ� ������");
	}
	private void addSugarAndMilk(){
		System.out.println("��ũ�� ���� �߰�");
	}
}
