package questao07;

public class Jogador {
	private int forca;
	private int nivel;
	private int pontosAtuais;
	
	public void Jogador(int forca, int nivel, int pontosAtuais) {
		this.forca = forca;
		this.nivel = nivel;
		this.pontosAtuais = pontosAtuais;
	}
	
	public double poderDeAtaque() {
		return forca * nivel;
	}
	
	/*public void atacar(Jogador atacado) {
		return this.jogador;
	}*/
}
