package heranca;

public class ContaCorrente {
	int banco;
	int numero;
	int agencia;
	private double saldo;

	ContaCorrente(){
		
	}
	
	ContaCorrente(int banco, int agencia, int numero){
		this.banco = banco;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
		}		
	}
	
	void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public double getSaldo() {
		return saldo;
	}

}
