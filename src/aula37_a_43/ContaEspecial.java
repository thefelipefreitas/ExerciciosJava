package aula37_a_43;

public class ContaEspecial extends ContaSimples {

	private double limite;

	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "]";
	}

	public void sacar(double saque) {
		if (limite >= saque) {
			System.out.println("SAQUE EFETUADO! \nValor do saque: " + saque + "\nLimite Atual: " + limite);
		}
	}
}
