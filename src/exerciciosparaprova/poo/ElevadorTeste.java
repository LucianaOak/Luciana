package exerciciosparaprova.poo;

public class ElevadorTeste {

	public static void main(String[] args) {
		Elevador elevador1 = new Elevador();
		Elevador elevador2 = new Elevador(8,7);
		
		elevador1.setTotalAndares(17);
		elevador1.setCapacidadeElevador(10);

		elevador1.entrar();
		elevador1.entrar();
		elevador1.entrar();
		elevador1.entrar();

		System.out.println(elevador1.getNumeroPessoas());
		
		elevador2.entrar();
		elevador2.entrar();
		elevador2.entrar();
		System.out.println(elevador2.getNumeroPessoas());
		elevador2.sair();
		System.out.println(elevador2.getNumeroPessoas());
		elevador2.subir();
		System.out.println(elevador2.getAndarAtual());
		}
}


