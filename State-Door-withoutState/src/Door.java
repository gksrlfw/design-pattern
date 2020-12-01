/*
 * ���� ������ ������� ���� ����
 * ���±������
 */
public class Door {
	private DoorState currentState = DoorState.CLOSED;
	public DoorState getState() {
		return currentState;
	}
	public void open(){
		if(currentState==DoorState.CLOSED) {
			currentState = DoorState.OPENED;
			System.out.println("���� ����");
		}
	}
	public void close(){
		if(currentState==DoorState.OPENED) {
			currentState = DoorState.CLOSED;
			System.out.println("���� ����");
		}
	}
	public void lock(){
		if(currentState==DoorState.CLOSED) {
			currentState = DoorState.LOCKED;
			System.out.println("���� ���");
		}
	}
	public void unlock(){
		if(currentState==DoorState.LOCKED) {
			currentState = DoorState.CLOSED;
			System.out.println("��� ����");
		}
	}
}
