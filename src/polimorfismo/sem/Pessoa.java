package polimorfismo.sem;

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

	public List<String> getRoupa() {
		return roupa;
	}
	
	public void vestir (Blusa blusa) {
		this.roupa.add(blusa.getTipoBlusa());
	}

	public void vestir (Calca calca) {
		this.roupa.add(calca.getTipoCalca());
	}

	public void vestir (Calcado calcado) {
		this.roupa.add(calcado.getTipoCalcado());
	}


}
