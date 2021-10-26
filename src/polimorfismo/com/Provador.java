package polimorfismo.com;

import java.util.ArrayList;

public class Provador {

	public static void main(String[] args) {
	
		ArrayList<String> roupa = new ArrayList<>();
		Pessoa pessoa = new Pessoa("Ana", roupa);
		Blusa blusa = new Blusa("Blusa Branca");
		Calca calca = new Calca("Calca jeans");
		Calcado calcado = new Calcado("Bota");
		
		System.out.println(pessoa.getRoupa());
		
		pessoa.vestir(blusa);
		System.out.println(pessoa.getRoupa());
		
		pessoa.vestir(calca);
		System.out.println(pessoa.getRoupa());
		
		pessoa.vestir(calcado);
		System.out.println(pessoa.getRoupa());
	}

	}


