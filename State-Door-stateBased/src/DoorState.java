/*
 * ���� ������ ������� ���� ����
 * ���±������
 */
public interface DoorState {
	default void open() {}
	default void close() {}
	default void lock() {}
	default void unlock() {}
}
