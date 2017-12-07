package questao07;

public class TestaRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo retangulo = new Retangulo();
		
		retangulo.l1 = 5;
		retangulo.l2 = 10;
		
		System.out.println("Area = " + retangulo.calcularArea());
		System.out.println("Perimetro = " + retangulo.calcularPerimetro());
	}

}
