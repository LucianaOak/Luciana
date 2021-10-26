package repeticao;

import java.util.Scanner;

public class QuadradoNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int contador = 1;
		int num;
		
		while (contador <= 5) {
			System.out.println("Digite um n�mero: ");
			num= entrada.nextInt();
			
			System.out.printf("O quadrado de %d � %d.\n", num, (num*num));
			
			contador++;
		
		}
		entrada.close();
	}

}

	