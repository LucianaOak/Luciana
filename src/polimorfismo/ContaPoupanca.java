package polimorfismo;

public class ContaPoupanca extends ContaCorrente {
	public ContaPoupanca(int numero, String titular){
		super(numero, titular);		
	}

	public void atualizaRendimentos(double taxa) {
		super.atualizaRendimentos(2*taxa);
	}

}
