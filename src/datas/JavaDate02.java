package datas;

import java.util.Date;

public class JavaDate02 {

	public static void main(String[] args) {

		
		Long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println(currentTimeMillis);

		Date newDate = new Date(currentTimeMillis);

		System.out.println(newDate);

	}

}
