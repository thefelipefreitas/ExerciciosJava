package aula24;

public class TesteLivro {
	
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.nome = "O Poder do H�bito";
		livro.autor = "Charles Duhigg";
		livro.editora = "Objetiva";
		livro.idioma = "Portugu�s";
		livro.numPaginas = 408;
		
		System.out.println("Nome do Livro: " + livro.nome);
		System.out.println("Autor do Livro: " + livro.autor);
		System.out.println("Editora: " + livro.editora);
		System.out.println("Idioma: " + livro.idioma);
		System.out.println("N�mero de P�ginas: " + livro.numPaginas);

	}

}
