package arrayunidimensional;

import java.util.Scanner;

public class Tamanho {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamanho;
		
		System.out.println("Digite o tamanho do array: ");
		tamanho = entrada.nextInt();
		
		int[] valores = new int[tamanho];
		
		System.out.println("O tamanho do array �: " + valores.length);
		System.out.println("A vari�vel tamanho �: " + tamanho);
		
		for (int i=0; i<valores.length; i++) {
			System.out.println("Digite os valores: ");
			valores[i] = entrada.nextInt();
		}

		tamanho = 4;
		
		System.out.println("O tamanho do array �: " + valores.length);
		System.out.println("A vari�vel tamanho �: " + tamanho);
		
		for (int i=0; i<valores.length; i++) {
			System.out.println(valores[i]);
		}
				

		entrada.close();

	}

}
