package threade;

public class Marge implements Runnable{
	JarraBiscoitos jarra;
	public Marge(JarraBiscoitos jarra) {
		this.jarra = jarra;
	}
	
	public void bake(int numBiscoitos) {
		jarra.colocarBiscoito("Marge", numBiscoitos);
		try {
			Thread.sleep((int) Math.random() * 500);
		} catch (InterruptedException ie) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) bake(i); 
			
		
	}
	
}
