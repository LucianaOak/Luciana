package arrayunidimensional;

import java.util.Scanner;

public class PosicoesInvertidas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] valores = new int[5];
		
		for (int i=0; i<5; i++) {
			System.out.println("Digite os valores: ");
			valores[i] = entrada.nextInt();
		}
		
		for (int i=4; i>=0; i--) {
			System.out.println(valores[i]);
		}
		entrada.close();
	}

	}


