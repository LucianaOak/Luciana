package polimorfismo.com;

import java.util.List;

public class Pessoa {
	private final String nome;
	private final List<String> roupa;
	
	public Pessoa(String nome, List<String> roupa) {
		this.nome = nome;
		this.roupa = roupa;
	}

	public String getNome() {
		return nome;
	}

	public void vestir (Roupa roupa) {
		this.roupa.add(roupa.getTipoRoupa());
	}
	
	public List<String> getRoupa() {
		return roupa;
	}

}
