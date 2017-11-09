package questao04;

public class ArCondicionado {
	
	private int temperatura;
	private String modo;
	private int velocidade;
	
	public boolean liga(){
		return false;
	}
	
	public void setModo(String modo){
		this.modo = modo;
	}
	
	public void setTemperatura(int temp){
		this.temperatura = temp;
	}
	
	public void setVelocidade(int velocidade){
		this.velocidade = velocidade;
	}
	
	public void mostraDados(){
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Velocidade: " + velocidade);
		System.out.println("Modo: " + modo);
	}
}
