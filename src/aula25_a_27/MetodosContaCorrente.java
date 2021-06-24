package aula25_a_27;

import aula25_a_27.ContaCorrente;

public class MetodosContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();

		conta.atribuiValores();

		conta.mostraDados();

		conta.realizaSaque(50000);

		conta.consultaSaldo();

		conta.depositaDinheiro(8000);

		conta.consultaSaldo();

		conta.verificaEspecial();

	}

}
