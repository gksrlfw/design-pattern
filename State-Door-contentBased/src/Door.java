/*
 * 문맥기반전이
 * 상태객체에서는 상태변화에 대한 T/F만 반환하고, 변화는 문맥에서 실행한다
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
