package contacorrente;

public class ContaCorrente {
	public String nomebanco;
	public int numconta;
	public int ag;
	public double saldo;
	public String nometit;
	

	public ContaCorrente() {

	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			this.saldo = this.saldo-valor;
		} else {
			System.out.println("Sua Conta não tem Saldo" + nometit);
		}
	}

	public void depositar(double valor) {
		this.saldo = this.saldo+valor;
		}

	public double getSaldo() {
		return saldo;
	}
}
