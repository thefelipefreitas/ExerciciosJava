package aula35;

public class Somatoria {

	public static int soma(int num) {

		if (num < 0) {
			return 0;
		} else {
			return (soma(num - 1) + num);
		}
	}
}
