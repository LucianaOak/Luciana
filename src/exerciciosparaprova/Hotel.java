package exerciciosparaprova;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int maisDe10km = 0;
		int mediaVisitantes;
		String nome;
		double distancia = 0;
		int tipoAcesso;

		System.out.println("Digite a distancia do hotel ao centro da cidade: ");
		distancia = entrada.nextInt();

		while (distancia != 0) {
			System.out.println("Digite o nome do hotel: ");
			nome = entrada.next();
			System.out.println("Digite o tipo de acesso ao hotel: ");
			tipoAcesso = entrada.nextInt();
			System.out.println("Digite o n�mero medio de visitantes ao hotel: ");
			mediaVisitantes = entrada.nextInt();

			if (distancia > 10) {
				maisDe10km++;
			}
			
			if (tipoAcesso == 0) {
				if (mediaVisitantes > 100) {
					System.out.println("Nome do hotel: " + nome);
					System.out.println("Dist�ncia do hotel ao centro da cidade: " + distancia);
				}
			}
			System.out.println("Digite a distancia do hotel ao centro da cidade: ");
			distancia = entrada.nextInt();
		}

		System.out.println("N�mero de hoteis que distam mais de 10km: " + maisDe10km);

		entrada.close();

	}

}
