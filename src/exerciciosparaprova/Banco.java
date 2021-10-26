package exerciciosparaprova;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double saldoMedio;

		System.out.println("Digite o saldo m�dio do cliente: ");
		saldoMedio = entrada.nextDouble();
		
		if (saldoMedio <= 100) {
			System.out.println("O saldo m�dio � de " + saldoMedio + " e n�o tem direito a cr�dito");
		} else if (saldoMedio <= 500) {
			System.out.println("O saldo m�dio � de " + saldoMedio + " e o cr�dito poss�vel � de " + saldoMedio*0.2);
		} else {
		System.out.println("O saldo m�dio � de " + saldoMedio + " e o cr�dito poss�vel � de " + saldoMedio*0.4);
		}
		entrada.close();

	}

}
