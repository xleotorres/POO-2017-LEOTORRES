package app;
import model.Data;
import model.Funcionario;


public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		Data data = new Data();
		
		data.dia = 23;
		data.mes = 06;
		data.ano = 2010;
		
		f1.nome = "Leonardo";
		f1.salario = 2600;
		f1.recebeAumento(300);
		f1.dataDeEntrada = data;
		f1.rg = "2.333.444";
		f1.departamento = "Recursos Humanos";
		
		f1.mostra();
		//System.out.println("salario atual: " + f1.salario);
		//System.out.println("ganho anual: " + f1.calculaGanhoanual());
		

	}

}
