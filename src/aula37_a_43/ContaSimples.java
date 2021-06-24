package aula37_a_43;

public class ContaSimples {

	private String nomeCliente;
	private String numConta;
	protected double saldo;

	public ContaSimples(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}

	public void sacar(double saque) {

		if ((saldo - saque) >= 0) {
			saldo -= saque;
			System.out.println("Saque efetuado com sucesso, novo saldo: " + saldo);
		} else {
			System.out.println("SALDO INSUFICIENTE! \nSaldo atual: " + saldo);
		}
	}

	public void depositar(double deposito) {

		saldo += deposito;
		System.out.println("Deposito efetuado com sucesso, novo saldo: " + saldo);
	}

}