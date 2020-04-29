package session16.p2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderDemo {

	public static void main(String[] args)

	{

	Calendar cal = Calendar.getInstance();

	System.out.println("Year : " + cal.get(Calendar.YEAR));

	System.out.println("Month : " + cal.get(Calendar.MONTH));

	System.out.println("Day of Month : " + cal.get(Calendar.DAY_OF_MONTH));

	System.out.println("Day of Week : " + cal.get(Calendar.DAY_OF_WEEK));

	System.out.println("Day of Year : " + cal.get(Calendar.DAY_OF_YEAR));

	System.out.println("Week of Year : " + cal.get(Calendar.WEEK_OF_YEAR));

	System.out.println("Week of Month : " + cal.get(Calendar.WEEK_OF_MONTH));

	System.out.println("Hour : " + cal.get(Calendar.HOUR));

	System.out.println("AM PM : " + cal.get(Calendar.AM_PM));

	System.out.println("Hour of the Day : " + cal.get(Calendar.HOUR_OF_DAY));

	System.out.println("Minute : " + cal.get(Calendar.MINUTE));

	System.out.println("Second : " + cal.get(Calendar.SECOND));

	System.out.println();

	Date date= new Date();

	Calendar cal1 = Calendar.getInstance();

	cal1.setTime(date);

	Calendar cal2 = new GregorianCalendar(2016, Calendar.JUNE, 21);

	Date d = cal2.getTime();

	System.out.println("date from Calendar : " + d);

	cal2.add(Calendar.DAY_OF_MONTH, 1);

	d = cal2.getTime();

	System.out.println("date after adding one day (tommorrow) : " + d);

	cal2.add(Calendar.DAY_OF_MONTH, -2);

	d = cal2.getTime();

	System.out.println("date after subtracting two day (yesterday) : " + d);

	}

	}