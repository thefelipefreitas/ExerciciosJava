package aula28_a_33;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada("Phillips", 120, 570, 3.5, 2.2, 9.50, true);

		System.out.println("Marca: " + lampada.getMarca() + "\n" + "Voltagem: " + lampada.getVoltagem() + "\n"
				+ "Potência da Luz: " + lampada.getPotenciaLuz() + "\n" + "Dimensões: " + lampada.getDimensoes() + "\n"
				+ "Peso: " + lampada.getPeso() + "\n" + "Preço: " + lampada.getPreço() + "\n" + "Ligada: "
				+ lampada.isLigada());

		lampada.desligar();
		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();

	}
}
