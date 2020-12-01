public enum DoorState{
	OPENED {	
		@Override
		public DoorState open() {
			return this;
		}
		@Override
		public DoorState close() {
			System.out.println("���� ����");
			return CLOSED;
		}
		public DoorState lock() {
			return this;
		}
		public DoorState unlock() {
			return this;
		}
	},
	CLOSED {
		@Override
		public DoorState open() {
			System.out.println("���� ����");
			return OPENED;
		}
		@Override
		public DoorState close() {
			return this;
		}
		@Override
		public DoorState lock() {
			System.out.println("���� ���");
			return LOCKED;
		}
		public DoorState unlock() {
			return this;
		}
	},
	LOCKED {	
		@Override
		public DoorState open() {
			return this;
		}
		@Override
		public DoorState close() {
			return this;
		}
		@Override
		public DoorState lock() {
			return this;
		}
		@Override
		public DoorState unlock() {
			System.out.println("��� ����");
			return CLOSED;
		}
	};
	public abstract DoorState open();
	public abstract DoorState close();
	public abstract DoorState lock();
	public abstract DoorState unlock();
}