package arrayunidimensional;

import java.util.Scanner;

public class ProcuraNumero {

	public static void main(String[] args) {
		int[] numeros = new int[4];
		int numeroX;
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Digite um n�mero: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.println("N�mero a ser procurado: ");
		numeroX = entrada.nextInt();
		
		for(int i=0; i<numeros.length; i++) {
			if (numeroX == numeros[i]) {
				System.out.println("Encontrei o n�mero no �ndice " + i);
				//break;
			}
		}
		entrada.close();

	}

}
