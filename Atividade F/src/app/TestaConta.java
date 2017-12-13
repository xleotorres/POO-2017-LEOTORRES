package app;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta cc = new ContaCorrente();
		cc.deposita(1000);
		cc.saca(300);
		cc.atualiza(0.1);
		
		Conta cp = new ContaPoupanca();
		cp.deposita(1000);
		cp.saca(200);
		cp.atualiza(0.2);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
