package datas;

import java.util.Date;

public class JavaDateFinal {

	public static void main(String[] args) {

		Date myBirthday = new Date(954315000000L);
		System.out.println(myBirthday);

		//2010-05-15
		Date anyDate = new Date(1273892400000L);
		
		boolean isAfter = myBirthday.after(anyDate);
		System.out.println(isAfter);

		boolean isBefore = myBirthday.before(anyDate);
		System.out.println(isBefore);

	}

}
