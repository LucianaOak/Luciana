package selecao;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		/**
			 * Esse programa pede as medidas dos 3 lados de um tri�ngulo para o usu�rio. Em
			 * seguida, verifica se realmente esses lados formam um tri�ngulo e, se for esse
			 * o caso, retorna tamb�m o tipo de tri�ngulo: equil�tero, is�sceles ou
			 * escaleno.
			 * 
			 * Para ser um tri�ngulo, cada lado deve ser menor que a soma dos outros 2
			 * lados.
			 */

			int ladoA, ladoB, ladoC;
			Scanner tamanho = new Scanner(System.in);

			System.out.println("Digite o ladoA: ");
			ladoA = tamanho.nextInt();

			System.out.println("Digite o ladoB: ");
			ladoB = tamanho.nextInt();

			System.out.println("Digite o ladoC: ");
			ladoC = tamanho.nextInt();

			if ((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoA + ladoB))) {
				if ((ladoA == ladoB) && (ladoB == ladoC)) {
					System.out.println("Equil�tero!");
				} else if ((ladoA == ladoB) || (ladoC == ladoA) || (ladoC == ladoB)) {
					System.out.println("Is�sceles!");
				} else {
					System.out.println("Escaleno!");
				}
			} else {
				System.out.println("N�o � um tri�ngulo");
			}
			
			tamanho.close();

		}

}


