package questao09;

public class Produto {
	private String codigo;
	private int quantidade;
	private double valor;
	private String descricao;
	int quantidadeMinima = 0;
	
	public void Produto(String codigo, int quantidade, double valor, String descricao) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public boolean baixar(int valorBaixado) {
		if (quantidade < valorBaixado) {
			return false;
		}else {
			quantidade = quantidade - valorBaixado;
		}
		return true;
	}
	
	public int repor(int valorReposto) {
		return quantidade = quantidade - valorReposto;
	}
	
	public double reajusta(double taxa) {
		return valor + (valor * taxa)/100;
	}
	
	
}
