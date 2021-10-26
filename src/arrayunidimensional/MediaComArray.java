package arrayunidimensional;

import java.util.Scanner;

public class MediaComArray {

	public static void main(String[] args) {
		double[] notaAluno = new double[10];
		double media, soma=0;
		Scanner entrada = new Scanner(System.in);

		for (int i=0; i<10; i++) {
			System.out.println("Digite a nota: ");
			notaAluno[i] = entrada.nextDouble();
			soma = soma + notaAluno[i];
		}
		
		media = soma/10;
		System.out.println("A m�dia da classe �: " + media);
		entrada.close();
	}

}
