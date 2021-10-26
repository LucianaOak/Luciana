package poo.classe;

public class RetanguloTeste {

	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo();
		Retangulo novoRetangulo = new Retangulo(40, 10);
		
		retangulo1.largura = 30;
		retangulo1.altura = 20;
				
		System.out.println("A �rea atrav�s de cArea() �: " + retangulo1.cArea());
		
		System.out.println("O volume atrav�s de cVolume() �: " + retangulo1.cVolume(20));
		
		System.out.println("O per�metro atrav�s de cPerimetro() �: " + retangulo1.cPerimetro());
		
		System.out.println();

		System.out.println("A �rea atrav�s de cArea() �: " + novoRetangulo.cArea());
		
		System.out.println("O volume atrav�s de cVolume() �: " + novoRetangulo.cVolume(30));
		
		System.out.println("O per�metro atrav�s de cPerimetro() �: " + novoRetangulo.cPerimetro());

	}

}
