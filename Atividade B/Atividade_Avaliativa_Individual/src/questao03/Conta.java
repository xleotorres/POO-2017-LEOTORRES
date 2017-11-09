package questao03;

public class Conta {
	
	private String nome;
	private String cpf;
	private int numero;
	private double saldo;
	
	public void saca(double valor){
		this.saldo = saldo - valor;
	}
	
	public void deposita(double valor){
		this.saldo = saldo + valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}
