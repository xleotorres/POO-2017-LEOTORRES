package questao12;

public class TestaDesconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desconto d1 = new Desconto();
		d1.valor = 120;
		d1.taxa = 10;
		
		System.out.println(d1.calculaDesconto());
		
	}

}
