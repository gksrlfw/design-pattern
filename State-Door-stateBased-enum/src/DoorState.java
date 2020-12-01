public enum DoorState{
	OPENED {	
		@Override
		public void close(Door door) {
			System.out.println("문을 닫음");
			door.changeState(CLOSED);
		}
	},
	CLOSED {
		@Override
		public void open(Door door) {
			System.out.println("문을 열음");
			door.changeState(OPENED);
		}
		
		@Override
		public void lock(Door door) {
			System.out.println("문을 잠금");
			door.changeState(LOCKED);
		}

	},
	LOCKED {	
		@Override
		public void unlock(Door door) {
			System.out.println("잠금 해제");
			door.changeState(CLOSED);
		}
	};
	public void open(Door door) {}
	public void close(Door door) {}
	public void lock(Door door) {}
	public void unlock(Door door) {}
}
