package questao08;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new Conta();
		c1.depositar(1000);
		c1.sacar(500);
		
		System.out.println(c1.getSaldo());
		
		Conta c2 = new Conta();
		c2.depositar(2000);
		c2.trasnferir(c1, 700);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
	}

}
