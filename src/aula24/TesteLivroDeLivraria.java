package aula24;

public class TesteLivroDeLivraria {

	public static void main(String[] args) {

		LivroDeLivraria livro = new LivroDeLivraria();
		livro.nome = "O Poder do Hábito";
		livro.autor = "Charles Duhigg";
		livro.editora = "Objetiva";
		livro.idioma = "Português";
		livro.numPaginas = 408;
		livro.preco = 31.90;

		System.out.println("Nome do Livro: " + livro.nome);
		System.out.println("Autor do Livro: " + livro.autor);
		System.out.println("Editora: " + livro.editora);
		System.out.println("Idioma: " + livro.idioma);
		System.out.println("Número de Páginas: " + livro.numPaginas);
		System.out.println("Preço: " + livro.preco);

	}

}
