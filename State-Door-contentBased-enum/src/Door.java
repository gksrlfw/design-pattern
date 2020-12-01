/*
 * enum을 사용한 문맥기반전이
 * 상태객체에서 상태를 반환하여 문맥에서 전이시킨다 
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
