package aula24;

import java.util.Date;

public class TesteLivroDeBiblioteca {

	public static void main(String[] args) {

		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		livro.nome = "O Poder do H�bito";
		livro.autor = "Charles Duhigg";
		livro.editora = "Objetiva";
		livro.idioma = "Portugu�s";
		livro.numPaginas = 408;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Felipe";

		System.out.println("Nome do Livro: " + livro.nome);
		System.out.println("Autor do Livro: " + livro.autor);
		System.out.println("Editora: " + livro.editora);
		System.out.println("Idioma: " + livro.idioma);
		System.out.println("N�mero de P�ginas: " + livro.numPaginas);
		System.out.println("Livro Emprestado: " + livro.emprestado);
	}

}
