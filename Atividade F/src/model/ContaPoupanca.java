package model;

public class ContaPoupanca extends Conta{
	
	public void atualiza(double taxaSelic){
		super.saldo = super.saldo * taxaSelic * 3;
	}
}
