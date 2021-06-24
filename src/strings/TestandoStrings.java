package strings;

public class TestandoStrings {

	public static void main(String[] args) {
		
		String nome = "Felipe";
		StringBuilder builder = new StringBuilder(nome);

		System.out.println(builder.append(" Freitas"));
		System.out.println(builder.reverse());

		
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		
		System.out.println("A B C D E F G".toCharArray());
		System.out.println("Bombom de Chocolate".split(" "));
		System.out.println("Bombom de".concat(" Chocolate"));
		System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));

	}

}
