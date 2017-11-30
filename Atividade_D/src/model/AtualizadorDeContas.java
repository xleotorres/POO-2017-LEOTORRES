package model;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public void roda(Conta c){
		System.out.println(c.saldo);
		this.saldoTotal = c.saldo * selic;
		System.out.println(saldoTotal);
	}
	
	public double getSaldoTotal(){
		return this.saldoTotal;
	}
}
