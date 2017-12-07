package questao09;

public class TestaSituacaoFinanceira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SituacaoFinanceira sf = new SituacaoFinanceira();
		
		sf.valorCreditos = 1000;
		sf.valorDebitos = 875;
		
		System.out.println(sf.saldo());
	}

}
