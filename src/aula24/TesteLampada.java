package aula24;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada fluorescente = new Lampada();
		fluorescente.marca = "Phillips";
		fluorescente.voltagem = 110;
		fluorescente.potenciaLuz = 23;
		fluorescente.dimensoes = 11.5;
		fluorescente.peso = 80;
		fluorescente.preço = 12.15;

		System.out.println("Marca: " + fluorescente.marca);
		System.out.println("Voltagem: " + fluorescente.voltagem);
		System.out.println("Potência da fonte de luz: " + fluorescente.potenciaLuz);
		System.out.println("Dimensões: " + fluorescente.dimensoes);
		System.out.println("Peso: " + fluorescente.peso);
		System.out.println("Preço: " + fluorescente.preço);
	}
}
