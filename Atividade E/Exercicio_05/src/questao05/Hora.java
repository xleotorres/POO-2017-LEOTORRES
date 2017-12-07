package questao05;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	
	public boolean lerHora(int hora) {
		if (hora >= 0 && hora < 24){
			this.hora = hora;
		}
		return false;
	}
	
	public boolean lerMin(int minuto) {
		if (minuto >= 0 && minuto < 60){
			this.minuto = minuto;
		}
		return false;
	}
	
	public boolean lerSeg(int segundo) {
		if (segundo >= 0 && segundo < 60){
			this.segundo = segundo;
		}
		return false;
	}
	
	public void mostraHora() {
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}
}
