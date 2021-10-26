package funcionario;

public class Diretor extends Funcionario {

	Diretor() {
	}

	Diretor(String nome, String cargo) {
		super(nome, cargo);
	}

	public double adicionaBonus() {
		setSalario(getSalario() + getSalario()*0.15);
		return getSalario();
	}

}
