package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateFormat02 {
	
	public static void main(String[] args) {
	
		Date now = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		String formattedDate = formatter.format(now);
		
		System.out.println(formattedDate);
	}
}
