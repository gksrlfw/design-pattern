/*
 * 상태 패턴을 사용하지 않은 상태
 * 상태기반전이
 */
public class Door {
	private DoorState currentState = DoorState.CLOSED;
	public DoorState getState() {
		return currentState;
	}
	public void open(){
		if(currentState==DoorState.CLOSED) {
			currentState = DoorState.OPENED;
			System.out.println("문을 열음");
		}
	}
	public void close(){
		if(currentState==DoorState.OPENED) {
			currentState = DoorState.CLOSED;
			System.out.println("문을 닫음");
		}
	}
	public void lock(){
		if(currentState==DoorState.CLOSED) {
			currentState = DoorState.LOCKED;
			System.out.println("문을 잠금");
		}
	}
	public void unlock(){
		if(currentState==DoorState.LOCKED) {
			currentState = DoorState.CLOSED;
			System.out.println("잠금 해제");
		}
	}
}
