package aula25_a_27;

public class Lampada {

	String marca;
	int voltagem;
	int potenciaLuz; // pot�ncia da fonte de luz (Watts)
	double dimensoes;
	double peso; // gramas
	double pre�o;
	boolean ligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("L�mpada est� ligada!");
		} else {
			System.out.println("L�mpada est� desligada!");
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
