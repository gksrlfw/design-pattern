public enum DoorState{
	OPENED {	
		@Override
		public void close(Door door) {
			System.out.println("���� ����");
			door.changeState(CLOSED);
		}
	},
	CLOSED {
		@Override
		public void open(Door door) {
			System.out.println("���� ����");
			door.changeState(OPENED);
		}
		
		@Override
		public void lock(Door door) {
			System.out.println("���� ���");
			door.changeState(LOCKED);
		}

	},
	LOCKED {	
		@Override
		public void unlock(Door door) {
			System.out.println("��� ����");
			door.changeState(CLOSED);
		}
	};
	public void open(Door door) {}
	public void close(Door door) {}
	public void lock(Door door) {}
	public void unlock(Door door) {}
}
