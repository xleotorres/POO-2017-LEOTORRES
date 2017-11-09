package model;

public class Funcionario {

	public String nome;
	public double salario;
	public String departamento;
	public Data dataDeEntrada;
	public String rg;
	
	public void recebeAumento (double aumento) {
		salario = salario + aumento;
	}
	
	public double calculaGanhoanual() {
		return salario*12;
	}
	
	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		System.out.println("Ganho anual: " + this.calculaGanhoanual());
		System.out.println("Data de Admissão: " + dataDeEntrada.dataFormatada());
		System.out.println("Departamento: " + this.departamento);
		System.out.println("RG: " + this.rg);
	}
	
	
}
