package funcionario;

public class Gerente extends Funcionario {
	
	Gerente(){
		}
	
	Gerente(String nome, String cargo){
		super(nome, cargo);
	}
	
	public double adicionaBonus() {
		setSalario(getSalario() + getSalario()*0.12);
		return getSalario();
	}
	

}
