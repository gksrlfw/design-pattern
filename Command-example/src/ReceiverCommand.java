
public class ReceiverCommand implements Command {
	private Receiver r;
	public ReceiverCommand(Receiver r) {
		this.r = r;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		r.execute();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		r.undo();
	}
}
