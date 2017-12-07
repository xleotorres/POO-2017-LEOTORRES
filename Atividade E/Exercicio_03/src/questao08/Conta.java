package questao08;

public class Conta {
	
	String numero;
	double saldo;
	
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;
		}else {
			saldo = saldo - valor;
		}
		
		return true;
	}
	
	public double depositar(double valor) {
		return saldo = saldo + valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public boolean trasnferir(Conta destino, double valor) {
		if (this.saldo < valor) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
		}
		return true;
	}
}
