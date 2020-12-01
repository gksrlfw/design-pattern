/*
 * ���Ʊ������
 * ���°�ü������ ���º�ȭ�� ���� T/F�� ��ȯ�ϰ�, ��ȭ�� ���ƿ��� �����Ѵ�
 */
public class Door {
	private final DoorState openedState = new Opened();
	private final DoorState closedState = new Closed();
	private final DoorState lockedState = new Locked();
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
	public void open(){
		if(currentState.open()) currentState = openedState;
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
