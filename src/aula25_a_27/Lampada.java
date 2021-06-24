package aula25_a_27;

public class Lampada {

	String marca;
	int voltagem;
	int potenciaLuz; // potência da fonte de luz (Watts)
	double dimensoes;
	double peso; // gramas
	double preço;
	boolean ligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("Lâmpada está ligada!");
		} else {
			System.out.println("Lâmpada está desligada!");
		}
	}

	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}

}
