package desafioautomacao;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		float nota1; 
		float nota2; 
		float nota3;
		float media=0;
		int tipomedia;
		Scanner entrada = new Scanner(System.in);
		Scanner opcao = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nota1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nota2 = entrada.nextFloat();
		
		System.out.println("Digite a terceira nota");
		nota3 = entrada.nextFloat();

		System.out.println("Como voce deseja calcular a sua media:");
		System.out.println("1 - Media Aritmetica / 2 - Media Ponderada: ");
		tipomedia = opcao.nextInt();
		
		if(tipomedia == 1){
			media = nota1 + nota2 + nota3 / 3;
			}
		
		else if(tipomedia == 2) {
			media = ((nota1*3) + (nota2*3) + (nota3*4)) / 10;
			}
			
		System.out.println("A sua média é: " + media );
		
		entrada.close();
		opcao.close();
	}
		
	


}
