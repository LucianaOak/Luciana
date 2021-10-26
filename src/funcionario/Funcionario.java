package funcionario;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;

	Funcionario() {
	}
	
	Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		this.atribuiSalario();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double adicionaBonus() {
		this.salario = this.salario + this.salario* 0.1;
		return salario;
		}
		
	void atribuiSalario() {
		if (cargo.equals("Diretor")) {
			salario = 5000;
		} else if (cargo.equals("Gerente")) {
			salario = 3000;
		} else {
			salario = 2000;
		}
	}
}
