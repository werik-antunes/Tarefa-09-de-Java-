package repeticao;

public class ExerFor01 {
	
	public static void main(String[] args) {
	/*1) Apresentar os quadrados dos números inteiros de 15 a 200.*/
		for (int i = 15; i < 201; i++) {
			int res =(int)(Math.pow(i, 2));
			System.out.println("O quadrado de:" + i + " é " + res);
		}
	}
}
