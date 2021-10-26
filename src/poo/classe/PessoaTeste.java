package poo.classe;

public class PessoaTeste {

	public static void main(String[] args) {
						
				Pessoa pessoa1 = new Pessoa("Joice", 20, 2001);
				Pessoa pessoa2 = new Pessoa();
				Pessoa pessoa3 = new Pessoa("Carlos", 2006);
				
				pessoa2.nome = "Maria";
				pessoa2.anoNascimento = 1979;
				
				System.out.println("A idade �: " + pessoa1.calculaIdade(2021));

				System.out.println();
				
				System.out.println("A idade �: " + pessoa2.calculaIdade(2021));

				System.out.println();
				
				System.out.println("A idade �: " + pessoa3.calculaIdade(2021));
			}

		}

	


