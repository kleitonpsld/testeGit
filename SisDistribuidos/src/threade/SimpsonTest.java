package threade;

public class SimpsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JarraBiscoitos jarra = new JarraBiscoitos();
		Homer homer = new Homer(jarra);
		Marge marge = new Marge(jarra);
		
		new Thread(homer).start();
		new Thread(marge).start();
		
	}

}
