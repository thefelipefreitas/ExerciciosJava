package datas;

import java.util.Calendar;

public class JavaCalendar03 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();

		System.out.printf("%tc\n", now);

		System.out.printf("%tF\n", now);

		System.out.printf("%tD\n", now);

		System.out.printf("%tr\n", now);

		System.out.printf("%tT\n", now);

	}

}
