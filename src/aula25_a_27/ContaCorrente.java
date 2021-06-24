package aula25_a_27;

public class ContaCorrente {

	int numero;
	double saldo;
	double limite;
	boolean status; // se a conta � especial ou n�o

	void atribuiValores() {
		numero = 11092;
		saldo = 80000;
		limite = 100000;
		status = false;
	}

	void mostraDados() {

		System.out.println("N�mero: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println("Status: " + status);
	}

	double realizaSaque(double saque) {

		if (saque < saldo) {
			saldo -= saque;
			System.out.println("Um saque de R$" + saque + " foi realizado.");
		} else {
			System.out.println("O saque n�o pode ser feito, sem saldo suficiente! ");
		}

		return saldo;
	}

	double depositaDinheiro(double deposito) {

		saldo += deposito;
		System.out.println("Um deposito de R$" + deposito + " foi realizado.");
		return saldo;
	}

	double consultaSaldo() {

		System.out.println("Saldo atual: " + saldo);
		return saldo;
	}

	void verificaEspecial() {

		if (status) {
			System.out.println("Cliente est� usando cheque especial");
		} else {
			System.out.println("Cliente n�o est� usando cheque especial");
		}

	}

}
