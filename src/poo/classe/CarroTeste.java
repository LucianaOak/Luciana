package poo.classe;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		
		carro1.cor = "vermelho";
		carro1.velocidadeMax = 220;
		carro1.modelo = "ecosport";

		System.out.println("A vari�vel carro1: " + carro1);
		System.out.println("A cor do carro1 �: " + carro1.cor);
		System.out.println("A velocidade M�xima do carro1 �: " + carro1.velocidadeMax);
		System.out.println("O modelo do carro1 �: " + carro1.modelo);

		System.out.println();
		
		System.out.println("A cor do carro2 �: " + carro2.cor);
		System.out.println("A velocidade M�xima do carro2 �: " + carro2.velocidadeMax);
		System.out.println("O modelo do carro2 �: " + carro2.modelo);
		System.out.println("O ano do carro2 �: " + carro2.ano);
		}
}
	

	
		
		


