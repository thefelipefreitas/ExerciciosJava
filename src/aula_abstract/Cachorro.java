package aula_abstract;

public class Cachorro extends Mamifero {

	protected float tamanho;
	protected String raca;

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String amamentar() {

		String s = "Cachorro amamentando...";
		return s;
	}

	public String emitirSom() {

		String s1 = "Au, au, au...";
		return s1;
	}

}
