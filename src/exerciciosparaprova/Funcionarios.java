package exerciciosparaprova;

import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {
		int numFuncionarios;
		int acimaMedia = 0;
		double somaSalarios = 0, mediaSalarios;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de funcion�rios: ");
		numFuncionarios = entrada.nextInt();

		String[] nome = new String[numFuncionarios];
		double[] salario = new double[numFuncionarios];

		for (int i = 0; i < numFuncionarios; i++) {
			System.out.println("Digite o nome do funcion�rio: ");
			nome[i] = entrada.next();
			System.out.println("Digite o sal�rio do funcion�rio: ");
			salario[i] = entrada.nextDouble();
			somaSalarios += salario[i];
		}
		if (numFuncionarios > 0) {
			mediaSalarios = somaSalarios / numFuncionarios;
			for (int i=0; i<numFuncionarios; i++) {
				if (salario[i] > mediaSalarios) {
					acimaMedia++;
				}
			}
			System.out.println(" \n M�dia dos sal�rios=" + mediaSalarios
					+ " \n N�mero de funcion�rios com sal�rio acima da m�dia = " + acimaMedia);
		}
		entrada.close();

	}

}
