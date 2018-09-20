package threade;

public class Homer implements Runnable{
	JarraBiscoitos jarra;
	
	public Homer(JarraBiscoitos jarra) {
		this.jarra = jarra;
	}
	
	public  void comer() {
		jarra.pegarBiscoitos("Homer");
		try {
			Thread.sleep((int) Math.random() * 1000);
		} catch (InterruptedException ie) {
			// TODO: handle exception
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			comer();
		}
	}

}
