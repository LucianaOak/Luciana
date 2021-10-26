package polimorfismo.sem;

public class ProvadorSimples {

	public static void main(String[] args) {
		PessoaSimples pessoa = new PessoaSimples("Ana");
		Blusa blusa = new Blusa("Blusa Branca");
		Calca calca = new Calca("Calca jeans");
		Calcado calcado = new Calcado("Bota");
		
		pessoa.vestir(blusa);
		System.out.println(pessoa.getRoupa());
		
		pessoa.vestir(calca);
		System.out.println(pessoa.getRoupa());
		
		pessoa.vestir(calcado);
		System.out.println(pessoa.getRoupa());

	}

}
