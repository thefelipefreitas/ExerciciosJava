package datas;

import java.util.Date;

public class JavaDate03 {

	public static void main(String[] args) {

		Date dateInThePast = new Date(1513125807691L);

		Date dateInTheFuture = new Date(1613124807691L);

		System.out.println(dateInThePast);
		System.out.println(dateInTheFuture);

		boolean isAfter = dateInThePast.after(dateInTheFuture);
		System.out.println(isAfter);

		boolean isBefore = dateInThePast.before(dateInTheFuture);
		System.out.println(isBefore);

		Date sameDateInTheFuture = new Date(1613124807691L);

		boolean isEquals = dateInTheFuture.equals(sameDateInTheFuture);
		System.out.println(isEquals);

	}

}
