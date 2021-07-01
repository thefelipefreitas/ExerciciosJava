package datas;

import java.util.Calendar;

public class JavaCalendarFinal {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();

		Calendar dueDate = Calendar.getInstance();
		dueDate.add(Calendar.DATE, 10);

		System.out.println("Today = " + now.getTime());
		
		if (dueDate.get(Calendar.DAY_OF_WEEK) == 1 || dueDate.get(Calendar.DAY_OF_WEEK) == 7) {
			dueDate.add(Calendar.DATE, 1);
			System.out.printf("Due Date = " +  dueDate.getTime());
		} else {
			System.out.printf("Due Date = " +  dueDate.getTime());
		}

	}

}
