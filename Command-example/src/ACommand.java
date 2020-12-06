
public class ACommand implements Command {
	private A a;
	public ACommand(A a) {
		this.a = a;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		a.execute();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		a.undo();
	}
	
}
