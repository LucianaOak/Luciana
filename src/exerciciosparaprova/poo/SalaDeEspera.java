package exerciciosparaprova.poo;

public class SalaDeEspera {
	private int capacidade;
	private int pessoasNaSala;

	SalaDeEspera(int capacidade) {
		this.capacidade = capacidade;
		this.pessoasNaSala = 0;
	}

	void entrar() {
		if (this.pessoasNaSala < capacidade) {
			this.pessoasNaSala += 1;
		} else {
			System.out.println("Sala Cheia!!!");
		}
	}

	void sair() {
		if (this.pessoasNaSala > 0) {
			this.pessoasNaSala -= 1;
		} else {
			System.out.println("Sala Vazia!!!");
		}
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPessoasNaSala() {
		return pessoasNaSala;
	}

}
