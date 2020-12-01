public class Closed implements DoorState {
	@Override
	public boolean open() {
		System.out.println("���� ����");
		return true;
	}

	@Override
	public boolean close() {
		System.out.println("���� �̹� ���� ����");
		return false;
	}

	@Override
	public boolean lock() {
		System.out.println("���� ���");
		return true;
	}

	@Override
	public boolean unlock() {
		System.out.println("���� ��� ���� ����");
		return false;
	}
}