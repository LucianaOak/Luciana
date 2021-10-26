package exerciciosparaprova.poo;

public class SalaDeEsperaTeste {

	public static void main(String[] args) {
		SalaDeEspera sala = new SalaDeEspera(3);

		sala.entrar();
		sala.entrar();
		System.out.println("Pessoas na sala: " + sala.getPessoasNaSala());

		sala.entrar();
		sala.entrar();
		System.out.println("Pessoas na sala: " + sala.getPessoasNaSala());

		sala.sair();
		sala.sair();
		System.out.println("Pessoas na sala: " + sala.getPessoasNaSala());

		sala.sair();
		sala.sair();
		System.out.println("Pessoas na sala: " + sala.getPessoasNaSala());
	}

}
