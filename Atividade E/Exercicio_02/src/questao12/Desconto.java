package questao12;

public class Desconto {
	double valor;
	double taxa;
	
	public double calculaDesconto() {
		return valor - (valor*taxa / 100);
	}
}
