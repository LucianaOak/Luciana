package poo.classe;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno("Vitor", 002);
		Aluno aluno3 = new Aluno(003, "Maria");
		Aluno aluno4 = new Aluno("Pedro");
		
		Aluno umAluno = new Aluno();
		
		aluno1.nome = "Jo�o";
		aluno1.id = 001;
		
		System.out.println("O nome do aluno1 �: " + aluno1.nome);
		System.out.println("O id do aluno1 �: " + aluno1.id);
		
		System.out.println();
		
		System.out.println("O nome do aluno2 �: " + aluno2.nome);
		System.out.println("O id do aluno2 �: " + aluno2.id);
		
		System.out.println();
		
		System.out.println("O nome do aluno3 �: " + aluno3.nome);
		System.out.println("O id do aluno3 �: " + aluno3.id );

		aluno4.id = 004;
		
		System.out.println();
		
		System.out.println("O nome do aluno4 �: " + aluno4.nome);
		System.out.println("O id do aluno4 �: " + aluno4.id);
		
		System.out.println();
		
		umAluno.nome = "Alice";
		umAluno.id = 005;
		
		System.out.println("O nome do umAluno �: " + umAluno.nome);
		System.out.println("O id do umAluno �: " + umAluno.id);
		}
	}
