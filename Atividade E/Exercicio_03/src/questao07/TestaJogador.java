package questao07;

public class TestaJogador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jogador j1 = new Jogador();
		j1.Jogador(10, 15, 30);
		
		Jogador j2 = new Jogador();
		j2.Jogador(12, 12, 40);
		
		System.out.println(j1.poderDeAtaque());
	}

}
