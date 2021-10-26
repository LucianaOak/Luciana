package exerciciosparaprova;

import java.util.Scanner;

public class Tabuleiro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int linha, coluna;

		System.out.println("Digite a Linha: ");
		linha = entrada.nextInt();
		System.out.println("Digite a Coluna: ");
		coluna = entrada.nextInt();

		if ((linha % 2 == 0 && coluna % 2 == 0) || (linha % 2 == 1 && coluna % 2 == 1)) {
			System.out.println("Quadrado Preto!");
		} else {
			System.out.println("Quadrado Branco!");
			
		}
		entrada.close();
	}
	
}
