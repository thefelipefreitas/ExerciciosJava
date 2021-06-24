package aula37_a_43;

public class TesteConta {

	public static void main(String[] args) {

		ContaSimples conta = new ContaSimples("Felipe Freitas da Silva", "19283720", 15670);
		System.out.println("Conta Bancária criada!");
		conta.sacar(10000);
		conta.depositar(4000);
		System.out.println(conta.toString());

		ContaPoupanca poupanca = new ContaPoupanca("Joaozinho da Silva", "88821702", 3000, 90000);
		System.out.println("\nConta Poupança criada!");
		poupanca.sacar(200);
		poupanca.depositar(250);
		poupanca.calcularNovoSaldo(1.4);
		System.out.println(poupanca.toString());

		ContaEspecial especial = new ContaEspecial("Maria Pereira", "773729407", 6000, 5);
		System.out.println("\nConta Especial Criada");
		especial.sacar(4500);
		especial.depositar(3300);
		System.out.println(especial.toString());

	}
}
