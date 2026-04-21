// Henry belik

import java.util.ArrayList;
import java.util.Collections;

public class calendarDateMain {
	public static void main(String[] args) {
        // yyyy/mm/dd
        CalendarDate date1 = new CalendarDate(2023, 3, 7);
        CalendarDate date2 = new CalendarDate(2023, 12, 25);
        CalendarDate date3 = new CalendarDate(2024, 3, 7);

        System.out.println("Date 1: " + date1.getMonth() + "/" + date1.getDay() + "/" + date1.getYear());
        System.out.println("Date 2: " + date2.getMonth() + "/" + date2.getDay() + "/" + date2.getYear());
        System.out.println("Date 3: " + date3.getMonth() + "/" + date3.getDay() + "/" + date3.getYear());

        System.out.println("String representation of Date 1: " + date1.toString());
        System.out.println("String representation of Date 2: " + date2.toString());
        System.out.println("String representation of Date 3: " + date3.toString());
        
        ArrayList<CalendarDate> dates = new ArrayList<>();
        dates.add(date1);
        dates.add(date2);
        dates.add(date3);
        dates.add(new CalendarDate(2024, 1, 1));
        dates.add(new CalendarDate(2024, 1, 4));
        
        System.out.println("dates: " + dates);
        Collections.sort(dates);
        System.out.println("dates: " + dates);
	}
}
