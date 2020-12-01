public class Closed implements DoorState {
	private Door door;
    public Closed(Door door){
        this.door = door;
    }
	@Override
	public void open() {
		System.out.println("���� ����");
		door.changeToOpenedState();
	}

	@Override
	public void close() {
		System.out.println("���� �̹� ���� ����");
	}

	@Override
	public void lock() {
		System.out.println("���� ���");
		door.changeToLockedState();
	}

	@Override
	public void unlock() {
		System.out.println("���� ��� ���� ����");
	}
}