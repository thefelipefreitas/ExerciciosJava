package aula28_a_33;

public class Lampada {

	private String marca;
	private int voltagem;
	private int potenciaLuz; // pot�ncia da fonte de luz (Watts)
	private double dimensoes;
	private double peso; // gramas
	private double pre�o;
	private boolean ligada;

	public Lampada(String marca, int voltagem, int potenciaLuz, double dimensoes, double peso, double pre�o,
			boolean ligada) {
		super();
		this.marca = marca;
		this.voltagem = voltagem;
		this.potenciaLuz = potenciaLuz;
		this.dimensoes = dimensoes;
		this.peso = peso;
		this.pre�o = pre�o;
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

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
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
			System.out.println("L�mpada est� ligada!");
		} else {
			System.out.println("L�mpada est� desligada!");
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
