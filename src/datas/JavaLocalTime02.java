package datas;

import java.time.LocalTime;

public class JavaLocalTime02 {

	public static void main(String[] args) {

		LocalTime now = LocalTime.now();

		System.out.println(now);

		LocalTime oneMoreHour = now.plusHours(1);

		System.out.println(oneMoreHour);

	}

}
