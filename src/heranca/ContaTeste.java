package heranca;

public class ContaTeste {

	public static void main(String[] args) {
		ContaCorrentePF conta1 = new ContaCorrentePF();
		ContaCorrentePJ conta2 = new ContaCorrentePJ();
		

		conta1.banco = 1;
		conta1.agencia = 11;
		conta1.numero = 111;
		conta1.titular = "Ana";
		conta1.cpf = "000.000.000-01";

		conta1.depositar(1000);
		System.out.println("Saldo conta1: " + conta1.getSaldo());

		conta1.sacar(10);
		System.out.println("Saldo conta1: " + conta1.getSaldo());

		System.out.println();

		conta2.banco = 2;
		conta2.agencia = 22;
		conta2.numero = 222;
		conta2.razaoSocial = "Minha empresa";
		conta2.cnpj = "00.000.000/0001-00";

		conta2.depositar(3000);
		System.out.println("Saldo conta2: " + conta2.getSaldo());

		conta2.sacar(200);
		System.out.println("Saldo conta2: " + conta2.getSaldo());
	}
		

	}


