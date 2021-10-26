package arrayunidimensional;

import java.util.Scanner;

public class AcimadaMedia {

	public static void main(String[] args) {
		double[] notaAluno = new double[10];
		double media, soma=0;
		int acimaDaMedia = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i=0; i<10; i++) {
			System.out.println("Digite a nota: ");
			notaAluno[i] = entrada.nextDouble();
			soma = soma + notaAluno[i];
		}
		
		media = soma/10;
		System.out.println("A m�dia da classe �: " + media);
		
		for (int i=0; i<10; i++) {
			if (notaAluno[i] > media) {
				acimaDaMedia = acimaDaMedia + 1; // acimaDaMedia++;
			}
		}
		
		System.out.println("N�mero de alunos acima da m�dia: " + acimaDaMedia);
		
		entrada.close();
	}

	}


