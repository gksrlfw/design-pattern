public enum DoorState{
	OPENED {	
		@Override
		public DoorState open() {
			return this;
		}
		@Override
		public DoorState close() {
			System.out.println("문을 닫음");
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
			System.out.println("문을 열음");
			return OPENED;
		}
		@Override
		public DoorState close() {
			return this;
		}
		@Override
		public DoorState lock() {
			System.out.println("문을 잠금");
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
			System.out.println("잠금 해제");
			return CLOSED;
		}
	};
	public abstract DoorState open();
	public abstract DoorState close();
	public abstract DoorState lock();
	public abstract DoorState unlock();
}