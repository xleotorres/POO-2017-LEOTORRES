package model;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	public String dataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
