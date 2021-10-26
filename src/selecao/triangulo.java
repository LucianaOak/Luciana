package selecao;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		/**
			 * Esse programa pede as medidas dos 3 lados de um triângulo para o usuário. Em
			 * seguida, verifica se realmente esses lados formam um triângulo e, se for esse
			 * o caso, retorna também o tipo de triângulo: equilátero, isósceles ou
			 * escaleno.
			 * 
			 * Para ser um triângulo, cada lado deve ser menor que a soma dos outros 2
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
					System.out.println("Equilátero!");
				} else if ((ladoA == ladoB) || (ladoC == ladoA) || (ladoC == ladoB)) {
					System.out.println("Isósceles!");
				} else {
					System.out.println("Escaleno!");
				}
			} else {
				System.out.println("Não é um triângulo");
			}
			
			tamanho.close();

		}

}


