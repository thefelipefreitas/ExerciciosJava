package datas;

import java.time.LocalDateTime;

public class JavaLocalDateTime {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);

		LocalDateTime future = now.plusHours(1).plusDays(8).plusSeconds(12);
		
		System.out.println(future);
		
		
	}

}
