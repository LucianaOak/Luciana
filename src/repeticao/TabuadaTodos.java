package repeticao;

import java.util.Scanner;

public class TabuadaTodos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um n�mero: ");
		num= entrada.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %d X %d = %d\n", num, i, (num*i));
		}
		
		entrada.close();
	}

}
