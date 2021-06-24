package aula25_a_27;

import aula25_a_27.Lampada;

public class MetodosLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligar();

		lampada.mostrarEstado();

		lampada.desligar();

		lampada.mostrarEstado();

		lampada.mudarEstado();

		lampada.mostrarEstado();

	}
}