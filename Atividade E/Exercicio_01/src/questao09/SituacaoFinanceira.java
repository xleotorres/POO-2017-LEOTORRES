package questao09;

public class SituacaoFinanceira {
	
	public double valorCreditos;
	public double valorDebitos;
	
	public double saldo() {
		return valorCreditos - valorDebitos;
	}
}
