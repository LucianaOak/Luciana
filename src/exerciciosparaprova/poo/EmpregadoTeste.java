package exerciciosparaprova.poo;

public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado empregado2 = new Empregado();
		Empregado empregado1 = new Empregado("Alex", "Vieira", 2000);
		
		empregado2.setNome("Carlos");
		empregado2.setSobrenome("Matos");
		empregado2.setSalario(5000.00);
		
		System.out.println("Nome do Empregado1: " + empregado1.getNome());
		System.out.println("Sobrenome do Empregado1: " + empregado1.getSobrenome());
		System.out.println("Salario Empregado1: " + empregado1.getSalario());
		System.out.println();
		
		System.out.println("Nome Empregado2: " + empregado2.getNome());
		System.out.println("Sobrenome do Empregado2: " + empregado2.getSobrenome());
		System.out.println("Salario Empregado2: " + empregado2.getSalario());
		System.out.println();
		
		empregado1.reajusteSalario(10.0);
		System.out.println("Novo Salario do Empregado1 é: " + empregado1.getSalario());
		empregado2.reajusteSalario(10.5);
		System.out.println("Novo Salario do Empregado2 é: " + empregado2.getSalario());
	}

}
