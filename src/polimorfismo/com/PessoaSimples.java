package polimorfismo.com;

public class PessoaSimples {
	private final String nome;
	private String roupa;
	
	public PessoaSimples(String nome) {
		this.nome = nome;
	}

	public void vestir (Roupa roupa) {
		this.roupa = roupa.getTipoRoupa();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRoupa() {
		return roupa;
	}

}
