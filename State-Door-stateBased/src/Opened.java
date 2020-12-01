
public class Opened implements DoorState {
	private Door door;
	public Opened(Door door){
        this.door = door;
    }
	@Override
	public void open() {
		System.out.println("�̹� ���� ����");
	}

	@Override
	public void close() {
		System.out.println("���� ����");
		door.changeToClosedState();
	}

	@Override
	public void lock() {
		System.out.println("���� ���� �־� ��� �� ����");
	}

	@Override
	public void unlock() {
		System.out.println("���� ��� ���� ����");
	}
}
