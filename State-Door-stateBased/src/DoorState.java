/*
 * 상태 패턴을 사용하지 않은 상태
 * 상태기반전이
 */
public interface DoorState {
	default void open() {}
	default void close() {}
	default void lock() {}
	default void unlock() {}
}
