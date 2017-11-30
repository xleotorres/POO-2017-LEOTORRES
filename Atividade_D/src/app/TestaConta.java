package app; 

import model.AtualizadorDeContas;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;


public class TestaConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c1.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c1.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		//System.out.println(c1.getSaldo());
		//System.out.println(cc.getSaldo());
		//System.out.println(cp.getSaldo());
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(c1);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}

}
