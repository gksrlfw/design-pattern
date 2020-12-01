/*
 * ���� ������ ������� ���� ����
 * ���±������
 */
public interface DoorState {
	default boolean open() { return false; }
	default boolean close() { return false; }
	default boolean lock() { return false; }
	default boolean unlock() { return false; }
}
