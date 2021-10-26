package exerciciosparaprova.poo;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int numeroPessoas;
	

	Elevador(){
	}
	
	Elevador(int totalAndares, int capacidadeElevador){
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public int getNumeroPessoas() {
		return numeroPessoas;
	}

	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}
	
	//para adicionar uma pessoa no elevador, caso ainda exista espaço;
	public void entrar() {
		if (this.numeroPessoas<this.capacidadeElevador) {
			this.numeroPessoas++;
		}
	}
		
	//para remover uma pessoa do elevador, caso exista alguma dentro dele;
	
	public void sair() {
		if (this.numeroPessoas>0) {
			this.numeroPessoas--;
		}		
	}
	
	//para o elevador subir um andar, caso n�o esteja no �ltimo andar;
	public void subir() {
		if (this.andarAtual<this.totalAndares) {
			this.andarAtual++;
		}
	}
	
	//para o elevador descer um andar, caso n�o esteja no t�rreo;
	public void descer() {
		if (this.andarAtual>0) {
			this.andarAtual--;
		}
	}

}
