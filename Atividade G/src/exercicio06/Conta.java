package exercicio06;

public abstract class Conta {
	
	protected double saldo;
	
	public abstract void saca(double valor);
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}
