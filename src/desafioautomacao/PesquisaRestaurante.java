package desafioautomacao;

import java.util.Scanner;

public class PesquisaRestaurante {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numtotalalunos=0;
		int menosquecinco=0;
		int entrecincoedez=0;
		int maisquedez=0;
		int menosquecincocont=0;
		int entrecincoedezcont=0;
		int maisquedezcont=0;
		int quantrest = 0;
		
		System.out.println("Digite o numero de Alunos que participaram da pesquisa:");
		numtotalalunos = entrada.nextInt();
		
		for(int i=0; numtotalalunos>i; i++){
			System.out.println("Quantas vezes o aluno usou o Restaurante: ");
			quantrest = entrada.nextInt();
			if(quantrest<5) {
				menosquecincocont++;
	        }else if (quantrest>=5 && quantrest<=10) {
	            entrecincoedezcont++; 
	        }else {
	            maisquedezcont++;
	                    
	                    }
			}

	 menosquecinco = menosquecincocont*100/numtotalalunos ;
	 entrecincoedez = entrecincoedezcont *100 / numtotalalunos;
	 maisquedez = maisquedezcont * 100 / numtotalalunos;
	    
	        System.out.println("A porcentagem menor que 5 é: " + menosquecinco);
	        System.out.println("A porcentagem entre 5 e 10 é: "+ entrecincoedez);
	        System.out.println("A porcentagem maior que cinco é: " + maisquedez);
	        entrada.close();
			
	
	}
}
