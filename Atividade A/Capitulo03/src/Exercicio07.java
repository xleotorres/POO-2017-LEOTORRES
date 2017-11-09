
public class Exercicio07 {

	public static void main(String[] args) {
		
		int x = 40;
		
		while (x != 1){
			if (x%2 == 0){
				x = x/2;
				System.out.println(x);
			}
			else{
				x = x*3+1;
				System.out.println(x);
			}
		}
	}

}
