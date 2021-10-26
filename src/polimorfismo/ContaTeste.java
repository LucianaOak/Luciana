package polimorfismo;

public class ContaTeste {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(001, "Maria");
		ContaPoupanca conta2 = new ContaPoupanca(002, "Joao");
		ContaEspecial conta3 = new ContaEspecial(003, "Ana");
		double valorTransferencia= 20;
		
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta1.getTitular(), conta1.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta2.getTitular(), conta2.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta3.getTitular(), conta3.getSaldo());
		
		
		conta1.depositar(200);
		conta2.depositar(100);
		conta3.depositar(300);
		
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta1.getTitular(), conta1.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta2.getTitular(), conta2.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta3.getTitular(), conta3.getSaldo());
		
		conta1.sacar(10);
		conta2.sacar(10);
		conta3.sacar(10);

		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta1.getTitular(), conta1.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta2.getTitular(), conta2.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta3.getTitular(), conta3.getSaldo());
		
		
		conta1.atualizaRendimentos(10);
		conta2.atualizaRendimentos(10);
		conta3.atualizaRendimentos(10);

		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta1.getTitular(), conta1.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta2.getTitular(), conta2.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta3.getTitular(), conta3.getSaldo());
		

		conta1.transferir(conta3, valorTransferencia);
		System.out.println("ValorTransfer�ncia: " + valorTransferencia);

		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta1.getTitular(), conta1.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta2.getTitular(), conta2.getSaldo());
		System.out.printf("Saldo da conta de %s � %.2f.\n", 
		           conta3.getTitular(), conta3.getSaldo());
		
}
	}


