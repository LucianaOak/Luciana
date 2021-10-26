package exerciciosparaprova;

import java.util.Scanner;

public class Corrida {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroVoltas, melhorVolta, voltasAcimaDaMedia=0;
		double mediaTempos = 0, melhorTempo;

		System.out.println("Digite o numero de Voltas: ");
		numeroVoltas = entrada.nextInt();

		double[] tempos = new double[numeroVoltas];
		for (int i = 0; i < tempos.length; i++) {
			System.out.println("Digite o Tempo das Voltas: ");
			tempos[i] = entrada.nextDouble();
			mediaTempos = mediaTempos + tempos[i];
		}

		mediaTempos = mediaTempos / numeroVoltas;
		melhorTempo = tempos[0];
		melhorVolta = 1;

		for (int i = 0; i < tempos.length; i++) {
			if (tempos[i] < melhorTempo) {
				melhorTempo = tempos[i];
				melhorVolta = i + 1;
			}
			if(tempos[i] > mediaTempos) {
				voltasAcimaDaMedia++;
				}
		}
		
		System.out.println("Melhor Tempo: " + melhorTempo);
		System.out.println("Melhor Volta: " + melhorVolta);
		System.out.println("Tempo Médio das Voltas: " + mediaTempos);
		System.out.println("Voltas Acima da Média: " + voltasAcimaDaMedia);
		entrada.close();
	}
}
