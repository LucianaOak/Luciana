package polimorfismo.sem;

public class PessoaSimples {
	private final String nome;
	String roupa;
	
	//construtor
	public PessoaSimples(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getRoupa() {
		return roupa;
	}

	public void vestir (Blusa blusa) {
		this.roupa = blusa.getTipoBlusa();
	}

	public void vestir (Calca calca) {
		this.roupa = calca.getTipoCalca();
	}

	public void vestir (Calcado calcado) {
		this.roupa = calcado.getTipoCalcado();
	}

	public void vestir (Vestido vestido) {
		this.roupa = vestido.getTipoVestido();
	}


}
