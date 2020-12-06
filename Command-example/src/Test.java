
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Command a = new ACommand(new A());
		Command reciever = new ReceiverCommand(new Receiver());
		CommandManager ac = new CommandManager();
		CommandManager rc = new CommandManager();
		
		ac.execute(a);
		ac.undo();
		rc.execute(reciever);
		rc.undo();
		
		ac.redo();
		rc.redo();
	}

}
