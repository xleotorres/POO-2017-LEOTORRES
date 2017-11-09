package questao03;

public class Funcionario {
	
	private String nome;
	private String rg;
	private double salario;
	private String departamento;
	
	public void aumento(double valor){
		salario = salario + valor;
	}
	
	public double ganhoAnual(){
		return salario * 12;
	}
	
	public void mostraFuncionario(){
		System.out.println("Nome: " + nome);
		System.out.println("Salario: " + salario);
		System.out.println("Departamento: " + departamento);
	}
	
}
