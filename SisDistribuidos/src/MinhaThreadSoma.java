import threade.SomadorVetor;

public class MinhaThreadSoma implements Runnable{
	
	private String nome;
	private int[] nums;
	private static SomadorVetor somador = new SomadorVetor();
	
	
	private MinhaThreadSoma(String nome, int[] nums) {
		super();
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.nome + "iniciada");
		int soma = somador.somaArray(this.nums);
		System.out.println("Resultado da soma para thread "+this.nome + " é: "+ soma);
		System.out.println(this.nome + "terminada");
	}
	
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
		
		MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
	}
	
}
