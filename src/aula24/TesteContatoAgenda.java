package aula24;

public class TesteContatoAgenda {

	public static void main(String[] args) {

		ContatoAgenda contato = new ContatoAgenda();
		contato.nome = "Cássio";
		contato.sobrenome = "Ramos";
		contato.email = "cassioramos12@gmail.com";
		contato.telefone = 965421335;
		contato.endereco = "Rua Dom Pedro II, 2902";

		System.out.println("Nome: " + contato.nome);
		System.out.println("Sobrenome: " + contato.sobrenome);
		System.out.println("Email: " + contato.email);
		System.out.println("Telefone: " + contato.telefone);
		System.out.println("Endereço: " + contato.endereco);

	}

}
