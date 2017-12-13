package model;

public class ContaCorrente extends Conta{
	
	public void atualiza(double taxaSelic){
		super.saldo = saldo * taxaSelic * 2;
	}
	
	public void deposita(double valor){
		super.saldo += valor - 0.10;
	}
}
