package imposto_renda;

public class PessoaJuridica extends Contribuinte {

	private double rendaBruta;
	private double aliquota = 0.1;
	private double imposto;

	public PessoaJuridica(String nome, double rendaBruta) {
		super(nome);
		this.rendaBruta = rendaBruta;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public void calcularImposto() {
		imposto = rendaBruta * aliquota;
	}

	@Override
	public String toString() {
		return "\nPessoaJuridica: " + nome + "\nRenda Bruta: R$" + rendaBruta + "\nAliquota: " + aliquota + "%"
				+ "\nImposto a pagar: R$" + imposto;
	}

}
