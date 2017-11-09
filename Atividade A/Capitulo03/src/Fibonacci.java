
public class Fibonacci {

	public static void main(String[] args) {
		
		int anterior = 0;
		int atual = 1;
		
		System.out.println(anterior);
		System.out.println(atual);
		
		while (anterior + atual <=100){
			
			System.out.println(atual + anterior);
			
			atual = atual + anterior;
			anterior = atual - anterior;
		}
	}

}
