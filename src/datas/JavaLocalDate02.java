package datas;

import java.time.LocalDate;

public class JavaLocalDate02 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
	
		LocalDate yesterday = today.minusDays(1);
		
		System.out.println(today);
		System.out.println(yesterday);
		
		
		
	}

}
