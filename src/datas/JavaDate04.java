package datas;

import java.time.Instant;
import java.util.Date;

public class JavaDate04 {

	public static void main(String[] args) {

		Date startDate = new Date(1613124807691L);
		System.out.println(startDate);

		Instant instant = startDate.toInstant();
		System.out.println(instant);
	}

}
