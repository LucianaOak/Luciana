package exerciciosparaprova.poo;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double Salario;

	Empregado() {

	}

	public Empregado(String nome, String sobrenome, double Salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.Salario = Salario;
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		if (salario < 0) {
			this.Salario = 0;
		} else {
			this.Salario = salario;
		}
	}

	public void reajusteSalario(double taxa) {
		this.Salario = this.Salario + this.Salario * taxa / 100;

	}
}
