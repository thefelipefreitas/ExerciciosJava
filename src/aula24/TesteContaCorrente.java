package aula24;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.numero = 11092;
		conta.saldo = 80570.07;
		conta.limite = 100000.00;
		conta.status = false;

		System.out.println("Número: " + conta.numero);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Limite: " + conta.limite);
		System.out.println("Status: " + conta.status);

	}

}
