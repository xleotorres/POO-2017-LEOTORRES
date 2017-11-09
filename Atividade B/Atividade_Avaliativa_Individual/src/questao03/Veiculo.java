package questao03;

public class Veiculo {
	
	public String modelo;
	public String montadora;
	public int velocidade;
	public String placa;
	public String cor;
	
	public void acelera(int accel){
		this.velocidade = velocidade + accel;
	}
	
	public void freia(int freia){
		this.velocidade = velocidade - freia;
	}
	
	
	
}
