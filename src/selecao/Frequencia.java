package selecao;

public class Frequencia {

	public static void main(String[] args) {
		
		boolean frequencia = true;
		double media = 8.0;
		
		if ((media >= 7.0) && (frequencia == true)) {
			System.out.println("Aprovado");
			
		}else if((media >= 3.0) && (frequencia == true)) {
			System.out.println("Recupera��o");
		}else {
			System.out.println("Reprovado");
		}
	
		

	}

}
