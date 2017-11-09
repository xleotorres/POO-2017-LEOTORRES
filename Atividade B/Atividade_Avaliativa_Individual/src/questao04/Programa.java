package questao04;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArCondicionado a1 = new ArCondicionado();
		
		a1.liga();
		a1.setModo("Resfriar");
		a1.setVelocidade(3);
		a1.setTemperatura(16);
		
		a1.mostraDados();
	}

}
