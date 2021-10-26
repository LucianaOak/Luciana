package heranca;

public class ContaCorrentePF extends ContaCorrente {
	String titular;
	String cpf;

	ContaCorrentePF() {
		super();
	}

	ContaCorrentePF(int banco, int agencia, int numero, String titular, String cpf) {
		super(banco, agencia, numero);
		this.titular = titular;
		this.cpf = cpf;
	}

}
