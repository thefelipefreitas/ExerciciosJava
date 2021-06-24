package imposto_renda;

public class PessoaFisica extends Contribuinte {

	private double rendaBruta;
	private double aliquota;
	private double imposto;
	private int desconto;

	public PessoaFisica(String nome, double rendaBruta) {
		super(nome);
		this.rendaBruta = rendaBruta;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public void calcularImposto() {
		if (rendaBruta <= 0 && rendaBruta <= 1400) {
			System.out.println("RENDA INSUFICIENTE!");
		}
		if (rendaBruta >= 1400.01 && rendaBruta <= 2100) {
			aliquota = 0.1;
			desconto = 100;
			imposto = (rendaBruta * aliquota) - desconto;
		}
		if (rendaBruta >= 2100.01 && rendaBruta <= 2800) {
			aliquota = 0.15;
			desconto = 270;
			imposto = (rendaBruta * aliquota) - desconto;
		}
		if (rendaBruta >= 2800.01 && rendaBruta <= 3600) {
			aliquota = 0.25;
			desconto = 500;
			imposto = (rendaBruta * aliquota) - desconto;
		}
		if (rendaBruta >= 3600.01) {
			aliquota = 0.3;
			desconto = 700;
			imposto = (rendaBruta * aliquota) - desconto;
		}
	}

	@Override
	public String toString() {
		return "\nPessoaFisica: " + nome + "\nRendaBruta: R$" + rendaBruta + "\nAliquota: " + aliquota + "%"
				+ "\nDesconto: R$" + desconto + "\nImposto a pagar: R$" + imposto;

	}

}
