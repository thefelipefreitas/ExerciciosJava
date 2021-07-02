package datas;

import java.time.LocalDateTime;

public class JavaLocalDateTimeFinal {

	public static void main(String[] args) {

		// 15/05/2010 10:00:00
		LocalDateTime now = LocalDateTime.of(2010 , 05, 15, 10, 00, 00);
		
		// 15/11/2014 23:00:00
		LocalDateTime future = now.plusYears(4).plusMonths(6).plusHours(13);

		System.out.println("Now:  " + now);
		System.out.println("Future:  " + future);

	}

}
