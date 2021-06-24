package aula_abstract;

public class Teste {

	public static void main(String[] args) {

		Ave papagaio = new Papagaio();
		papagaio.setNome("Louro José");
		System.out.println(papagaio.getNome());
		System.out.println(papagaio.voar());
		System.out.println(papagaio.emitirSom());

		Mamifero cachorro = new Cachorro();
		cachorro.setNome("\nCão");
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.amamentar());
		System.out.println(cachorro.emitirSom());

		Mamifero gato = new Gato();
		gato.setNome("\nBichano");
		System.out.println(gato.getNome());
		System.out.println(gato.amamentar());
		System.out.println(gato.emitirSom());

	}
}
