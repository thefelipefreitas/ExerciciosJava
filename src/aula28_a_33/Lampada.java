package aula28_a_33;

public class Lampada {

	private String marca;
	private int voltagem;
	private int potenciaLuz; // potência da fonte de luz (Watts)
	private double dimensoes;
	private double peso; // gramas
	private double preço;
	private boolean ligada;

	public Lampada(String marca, int voltagem, int potenciaLuz, double dimensoes, double peso, double preço,
			boolean ligada) {
		super();
		this.marca = marca;
		this.voltagem = voltagem;
		this.potenciaLuz = potenciaLuz;
		this.dimensoes = dimensoes;
		this.peso = peso;
		this.preço = preço;
		this.ligada = ligada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getPotenciaLuz() {
		return potenciaLuz;
	}

	public void setPotenciaLuz(int potenciaLuz) {
		this.potenciaLuz = potenciaLuz;
	}

	public double getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(double dimensoes) {
		this.dimensoes = dimensoes;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void mostrarEstado() {
		if (ligada) {
			System.out.println("Lâmpada está ligada!");
		} else {
			System.out.println("Lâmpada está desligada!");
		}
	}

	public void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}
}
