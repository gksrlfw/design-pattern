/*
 * enum을 이용한 상태기반전이
 * 메서드로 넘겨준다
 */
public class Door {
	private DoorState currentState = DoorState.CLOSED;
	public DoorState getState() {
		return currentState;
	}
	public void changeState(DoorState nextState) {
		this.currentState = nextState;
	}
	public void open(){
		currentState.open(this);
	}
	public void close(){
		currentState.close(this);
	}
	public void lock(){
		currentState.lock(this);
	}
	public void unlock(){
		currentState.unlock(this);
	}
}
