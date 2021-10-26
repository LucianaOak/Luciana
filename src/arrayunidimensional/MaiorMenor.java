package arrayunidimensional;

public class MaiorMenor {

	public static void main(String[] args) {
		int[] numeros = {10, 27, 1, 5, 0, 2, 8, 9, 21, 23};
		int maior, menor;
		int posicaoMaior, posicaoMenor;
		
		maior = numeros[0];
		posicaoMaior = 0;
		menor = numeros[0];
		posicaoMenor = 0;
		
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
				posicaoMaior = i;
			}
			if(numeros[i] < menor) {
				menor = numeros[i];
				posicaoMenor = i;
			}
		}
		
		System.out.println("O maior valor � " + maior + " na posi��o " + posicaoMaior);
		System.out.println("O menor valor � " + menor + " na posi��o " + posicaoMenor);
		}
	}
