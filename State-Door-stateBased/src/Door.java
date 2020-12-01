/*
 * ���±������
 * ���� �� Ȥ�� �޼��� ȣ�� �ÿ� �ش� ��ü�� �Ѱ��־�, ���� ��ü���� ���� ���̸� �߻���Ų��
 */
public class Door {
	// Opened, Closed, Locked Ŭ������ �� ���¸� �뺯�Ѵ�
	private final DoorState openedState = new Opened(this);
	private final DoorState closedState = new Closed(this);
	private final DoorState lockedState = new Locked(this);
	private DoorState currentState = closedState;
	public DoorState getState() {
		return currentState;
	}
	public void changeToOpenedState(){
		currentState = openedState;
	}
	public void changeToClosedState(){
		currentState = closedState;
	}
	public void changeToLockedState(){
		currentState = lockedState;
	}
	// enum���� �޸�, ���°�ü���� ��ȯ�� �� �ִ� ����� ����
	// ���� ���, Opened Ŭ�������� Closed Ŭ������ ������ �� �ִ� ����� ����
	public void changeState(DoorState nextState) {
		this.currentState = nextState;
	}
	public void open(){
		currentState.open();
		// currentState.open(this);
	}
	public void close(){
		currentState.close();
	}
	public void lock(){
		currentState.lock();
	}
	public void unlock(){
		currentState.unlock();
	}
}
