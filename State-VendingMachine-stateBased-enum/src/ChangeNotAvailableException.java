
public class ChangeNotAvailableException extends Exception {
	private static final long serialVersionUID = -6480831563798786756L;
	public ChangeNotAvailableException() {
		super("거스름돈 준비 불가");
	}
	public ChangeNotAvailableException(String msg) {
		super(msg);
	}
}
