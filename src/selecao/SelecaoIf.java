package selecao;

public class SelecaoIf {
	public static void main(String[] args) {

		double media = 1.0;

		if (media >= 7.0) {
			System.out.println("Aprovado");

		} else if (media >= 3.0) {
			System.out.println("Recuperação");
		} else if (media <= 2.0) {
			System.out.println("Reprovado");
		}

	}
}
