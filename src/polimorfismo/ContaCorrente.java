package polimorfismo;

public class ContaCorrente {
	private int numero;
	private String titular;
	private double saldo;

	public ContaCorrente() {
	}

	public ContaCorrente(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public void sacar(double valor) {
		if ((saldo - Math.abs(valor)) >= 0) {
			this.saldo = saldo - Math.abs(valor);
		}
	}

	public void depositar(double valor) {
		this.saldo = saldo + Math.abs(valor);
	}

	// Polimorfismo Din�mico:
	// Classe mais gen�rica no par�metro e pode usar uma classe filha na chamada do
	// m�todo
	public void transferir(ContaCorrente contaDestino, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= Math.abs(valor);
			contaDestino.saldo += Math.abs(valor);
			valor = valor + 1;
		}
	}

	public void atualizaRendimentos(double taxa) {
		this.saldo = this.saldo * (1 + taxa / 100);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
