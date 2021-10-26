package sequencial;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua Idade: ");
		idade = entrada.nextInt();
		
		System.out.println("A idade é " + idade);
		
		entrada.close();
		}
 
}

