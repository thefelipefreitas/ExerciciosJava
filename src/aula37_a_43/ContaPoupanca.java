package aula37_a_43;

public class ContaPoupanca extends ContaSimples {

	private int diaRendimento;

	public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + "]";
	}

	public void calcularNovoSaldo(double taxaRendimento) {

		System.out.println("Dia do rendimento: " + diaRendimento);
		System.out.println("Saldo da poupança após rendimento: " + (saldo *= taxaRendimento));
	}

}
