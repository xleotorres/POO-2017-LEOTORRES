package exercicio06;

public class TestaConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		cc.saca(300);
		System.out.println(cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(800);
		cp.saca(300);
		System.out.println(cp.getSaldo());
	}

}
