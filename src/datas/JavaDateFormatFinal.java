package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateFormatFinal {

	public static void main(String[] args) {

		Date now = new Date();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm:ss.SSS");

		String formattedDate = formatter.format(now);

		System.out.println(formattedDate);

	}

}
