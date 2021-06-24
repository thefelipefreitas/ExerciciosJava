package aula28_a_33;

public class Conta {

	private int numero;
	private double saldo;
	private double limite;
	private boolean status; // se a conta é especial ou não

	public Conta(int numero, double saldo, double limite, boolean status) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.status = status;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double realizaSaque(double saque) {

		if (saque < saldo) {
			saldo -= saque;
			System.out.println("Um saque de R$" + saque + " foi realizado.");
		} else {
			System.out.println("O saque não pode ser feito, sem saldo suficiente! ");
		}

		return saldo;
	}

	public double depositaDinheiro(double deposito) {

		saldo += deposito;
		System.out.println("Um deposito de R$" + deposito + " foi realizado.");
		return saldo;
	}

	public double consultaSaldo() {

		System.out.println("Saldo atual: " + saldo);
		return saldo;
	}

	public void verificaEspecial() {

		if (status) {
			System.out.println("Cliente está usando cheque especial");
		} else {
			System.out.println("Cliente não está usando cheque especial");
		}

	}
}