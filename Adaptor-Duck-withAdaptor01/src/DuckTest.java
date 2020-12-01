
public class DuckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d1 = new TurkeyAdaptor(new Turkey());
		d1.quack();
		d1.flyingDuck();
	}
}
