package arrayunidimensional;

public class MesesdoAno {

	public static void main(String[] args) {
		int[] numMes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		String[] nomeMes = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
				"outubro", "novembro", "dezembro" };

		for (int i = 0; i < numMes.length; i++) {
			System.out.println("O m�s " + numMes[i] + " � " + nomeMes[i]);
		}

	}

}
