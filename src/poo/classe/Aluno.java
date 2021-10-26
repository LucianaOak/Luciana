package poo.classe;

public class Aluno {
	String nome;
	int id;
	
	Aluno(){
	}
	
	Aluno(String nomeInicial, int idInicial){
		nome = nomeInicial;
		id = idInicial;
	}
	
	Aluno(int idInicial, String nomeInicial){
		nome = nomeInicial;
		id = idInicial;
	}

	Aluno(String nomeInicial){
		nome = nomeInicial;
	}

}
