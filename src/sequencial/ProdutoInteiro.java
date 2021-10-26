package sequencial;

import java.util.Scanner;

public class ProdutoInteiro {
	public static void main(String[] args) {
		int a, b, produto;
		Scanner resultado = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro numero: ");
		a = resultado.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		b = resultado.nextInt();
		
		produto = a * b;
		
		System.out.println("O resultado da conta é: " + produto);
		
		resultado.close();
		
		
		
		
		
		
	}

}
