package exercicio06;

public class ContaCorrente extends Conta{

	public void saca(double valor) {
		// TODO Auto-generated method stub
		super.saldo = super.saldo - valor;
	}
	
}
