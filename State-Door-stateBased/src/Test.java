/*
 * 상태 패턴을 사용하지 않은 상태
 * 상태기반전이
 */
public class Test {
	public static void main(String[] args){
		Door door = new Door();
        door.close();
        door.lock();
        door.open();
        door.unlock();
        door.open();
	}
}
