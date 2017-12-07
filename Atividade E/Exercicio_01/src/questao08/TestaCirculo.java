package questao08;

public class TestaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo c1 = new Circulo();
		c1.raio = 3;
		
		System.out.println("Area = " + c1.calculaArea());
		System.out.println("Perimetro = " + c1.calculaPerimetro());
	}

}
