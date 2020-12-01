/*
 * enum�� ����� ���Ʊ������
 * ���°�ü���� ���¸� ��ȯ�Ͽ� ���ƿ��� ���̽�Ų�� 
 */
public class Door {
	private DoorState currentState = DoorState.CLOSED;
	public DoorState getState() {
		return currentState;
	}
	public void open(){
		currentState = currentState.open();
	}
	public void close(){
		currentState = currentState.close();
	}
	public void lock(){
		currentState = currentState.lock();
	}
	public void unlock(){
		currentState = currentState.unlock();
	}
}
