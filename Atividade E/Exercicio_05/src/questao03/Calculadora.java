package questao03;

public class Calculadora {
	private double operando1;
	private double operando2;
	
	public Calculadora(double operando1, double operando2) {
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public double soma() {
		return this.operando1 + this.operando2;
	}
	
	public double subtrai() {
		return this.operando1 - this.operando2;
	}
}
