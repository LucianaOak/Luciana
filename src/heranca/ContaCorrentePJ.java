package heranca;

public class ContaCorrentePJ extends ContaCorrente {
	String razaoSocial;
	String cnpj;
	
	ContaCorrentePJ(){
		super();
	}
	
	ContaCorrentePJ(int banco, int agencia, int numero, String razaoSocial, String cnpj){
		super(banco, agencia, numero);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

}
