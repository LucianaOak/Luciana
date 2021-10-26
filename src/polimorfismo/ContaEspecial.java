package polimorfismo;

public class ContaEspecial extends ContaCorrente {
	public ContaEspecial(int numero, String titular){
		super(numero, titular);		
	}
	
	public void atualizaRendimentos(double taxa) {
		super.atualizaRendimentos(3*taxa);
	}

}
