package aula_abstract;

public class Gato extends Mamifero {

	protected String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String amamentar() {

		String s = "Gato amamentando...";
		return s;
	}

	public String emitirSom() {

		String s1 = "Miau, miau, miau...";
		return s1;
	}
}
