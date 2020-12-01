/*
 * 상태기반전이
 * 생성 시 혹은 메서드 호출 시에 해당 객체를 넘겨주어, 상태 객체에서 상태 전이를 발생시킨다
 */
public class Door {
	// Opened, Closed, Locked 클래스가 각 상태를 대변한다
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
	// enum과는 달리, 상태객체에서 반환할 수 있는 방법이 없다
	// 예를 들면, Opened 클래스에서 Closed 클래스로 변경할 수 있는 방법이 없다
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
