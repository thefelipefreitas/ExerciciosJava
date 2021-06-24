package imposto_renda;

public class TesteImpostoRenda {

	public static void main(String[] args) {

		PessoaJuridica pessJ1 = new PessoaJuridica("Felipe", 30000);
		pessJ1.calcularImposto();
		System.out.println(pessJ1.toString());

		PessoaJuridica pessJ2 = new PessoaJuridica("Carla", 77000);
		pessJ2.calcularImposto();
		System.out.println(pessJ2.toString());

		PessoaJuridica pessJ3 = new PessoaJuridica("Fagner", 150000);
		pessJ3.calcularImposto();
		System.out.println(pessJ3.toString());

		PessoaFisica pessF1 = new PessoaFisica("Maria", 1200);
		pessF1.calcularImposto();
		System.out.println(pessF1.toString());

		PessoaFisica pessF2 = new PessoaFisica("Valdir", 2500);
		pessF2.calcularImposto();
		System.out.println(pessF2.toString());

		PessoaFisica pessF3 = new PessoaFisica("Silvana", 4000);
		pessF3.calcularImposto();
		System.out.println(pessF3.toString());

	}
}
