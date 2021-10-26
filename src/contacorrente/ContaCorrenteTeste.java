package contacorrente;

import java.util.Scanner;

public class ContaCorrenteTeste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		double valor;

		ContaCorrente novaconta = new ContaCorrente();

		System.out.println("Digite o nome do Banco: ");
		novaconta.nomebanco = entrada.nextLine();
		System.out.println("Digite a sua Agencia: ");
		novaconta.ag = entrada.nextInt();
		System.out.println("Digite sua conta: ");
		novaconta.numconta = entrada.nextInt();
		System.out.println("Digite seu Nome: ");
		novaconta.nometit = entrada.nextLine();
		System.out.println();

		while (opcao != 4) {

			System.out.println("Digite a operação desejada:");
			System.out.println("1 - Saque / 2 - Deposito / 3 - Verificar Saldo");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o valor desejado: ");
				valor = entrada.nextDouble();
				novaconta.sacar(valor);
				System.out.println("Seu saldo é: " + novaconta.saldo);

			} else if (opcao == 2) {
				System.out.println("Digite o valor a depositar ");
				valor = entrada.nextDouble();
				novaconta.depositar(valor);
				System.out.println("O novo valor do saldo é de: " + novaconta.saldo);

			} else if (opcao == 3) {
				System.out.println("Seu Saldo no momento é: " + novaconta.getSaldo());

			} else {
				System.out.println("Saiu das Operações!");
			}
		}
		entrada.close();

	}

}
