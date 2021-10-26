package arrayunidimensional;

import java.util.Scanner;

public class MediaSemArray {

	public static void main(String[] args) {
		double notaAluno;
		double media, soma=0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite a nota: ");
			notaAluno = entrada.nextDouble();
			soma = soma + notaAluno;
		}

		media = soma/10;
		System.out.println("A m�dia da sala �: " + media);
		entrada.close();

	}

}
