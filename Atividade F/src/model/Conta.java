package model;

public abstract class Conta {
	
	protected double saldo;
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void transfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo = destino.saldo + valor;
	}
	
	public abstract void atualiza(double taxaSelic);
}
