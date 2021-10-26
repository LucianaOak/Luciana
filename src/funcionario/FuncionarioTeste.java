package funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Gerente funcionario1 = new Gerente();
		Diretor funcionario2 = new Diretor("Melito", "Diretor");
		
		funcionario1.setNome("Helder");
		funcionario1.setCargo("Gerente");
		funcionario1.atribuiSalario();
		
		System.out.println("O nome do Funcionário1 é: " + funcionario1.getNome());
		System.out.println("O Cargo do Funcionário1 é: " + funcionario1.getCargo());
		System.out.println("O salario do Funcionário1 é: " + funcionario1.getSalario());
		funcionario1.atribuiSalario();
		System.out.println("O novo salario do Funcionário1 é: " + funcionario1.getSalario());
		funcionario1.adicionaBonus();
		System.out.println("O novo salario do Funcionário1 é: " + funcionario1.getSalario());
		System.out.println();
		
		System.out.println("O nome do Funcionário2 é: " + funcionario2.getNome());
		System.out.println("O Cargo do Funcionário2 é: " + funcionario2.getCargo());
		System.out.println("O salario do Funcionário2 é: " + funcionario2.getSalario());
		funcionario2.atribuiSalario();
		System.out.println("O novo salario do Funcionário2 é: " + funcionario2.getSalario());
		funcionario2.adicionaBonus();
		System.out.println("O novo salario do Funcionário2 é: " + funcionario2.getSalario());
		}
	}
