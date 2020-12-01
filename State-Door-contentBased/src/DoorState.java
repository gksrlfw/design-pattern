/*
 * 상태 패턴을 사용하지 않은 상태
 * 상태기반전이
 */
public interface DoorState {
	default boolean open() { return false; }
	default boolean close() { return false; }
	default boolean lock() { return false; }
	default boolean unlock() { return false; }
}
