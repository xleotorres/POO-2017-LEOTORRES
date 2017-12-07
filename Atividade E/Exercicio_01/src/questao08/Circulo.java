package questao08;

public class Circulo {
	
	public double raio;
	
	public double calculaArea(){
		return 3.14 * raio * raio;
	}
	
	public double calculaPerimetro() {
		return 2 * 3.14 * raio;
	}
}
