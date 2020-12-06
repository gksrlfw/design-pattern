import java.util.Stack;

/*
 * CommandManager�� �̿��� ������� �⺻ ����
 * 
 */
public class CommandManager {
	private Stack<Command> undoS = new Stack<>();
	private Stack<Command> redoS = new Stack<>();
	
	public void execute(Command c) {
		undoS.push(c);
		c.execute();
		undoS.push(c);
		redoS.clear();
	}
	public void undo() {
		if(undoS.empty()) return;
		Command c = undoS.pop();
		c.undo();
		redoS.push(c);
	}
	public void redo() {
		if(redoS.empty()) return;
		Command c = redoS.pop();
		c.execute();
	}
}
