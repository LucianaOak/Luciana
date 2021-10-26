package exerciciosparaprova;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2, opcao;

		System.out.println("Escolha a opera��o a ser realizada:");
		System.out.println("1- Verificar m�ltiplos");
		System.out.println("2- Verificar pares");
		System.out.println("3- sair");
		System.out.println("Digite sua op��o");
		opcao = entrada.nextInt();


		switch (opcao) {
		case 1:
			// Verificar se um desses n�meros � m�ltiplo do outro.
			// Caso afirmativo, informar qual o n�mero que � m�ltiplo do outro.
			// Caso contr�rio, informar que n�o s�o m�ltiplos.
			System.out.println("Digite o primeiro n�mero");
			n1 = entrada.nextInt();
			System.out.println("Digite o segundo n�mero");
			n2 = entrada.nextInt();
			if (n1 % n2 == 0) {
				System.out.println(n1 + " � m�ltiplo de " + n2);
			} else if (n2 % n1 == 0) {
				System.out.println(n2 + " � m�ltiplo de " + n1);
			} else {
				System.out.println("Os n�meros n�o s�o m�ltiplos entre si.");
			}
			break;
		case 2:
			System.out.println("Digite o primeiro n�mero");
			n1 = entrada.nextInt();
			System.out.println("Digite o segundo n�mero");
			n2 = entrada.nextInt();
			// Verificar se um dos dois n�meros lidos � par.
			// Nesse caso, basta informar que um deles � par, caso contr�rio, informar que
			// nenhum n�mero � par.
			if ((n1 % 2 == 0) || (n2 % 2 == 0)) {
				System.out.println("Um dos n�meros � par!");
			} else {
				System.out.println("Nenhum dos n�meros � par!");
			}
			break;
		case 3:
			System.out.println("Fim do programa!");
			break;
		default:
			System.out.println("Op��o inv�lida! Fim do programa!");
		}
		entrada.close();

	}

}
