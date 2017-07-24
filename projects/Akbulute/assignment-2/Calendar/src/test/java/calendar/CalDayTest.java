package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		
		int startHour=00;
		 int startMinute=00;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=2018;
		 String title="New Year!";
		 String description="Beginning of 2018.";
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		
		GregorianCalendar currentDay = new GregorianCalendar(startYear,startMonth,startDay);
		CalDay calendarDay = new CalDay(currentDay);
		calendarDay.addAppt(appt);
		

		assertTrue(calendarDay.isValid());
	 }

	 
	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=12;
		 int startMinute=00;
		 int startDay=30;
		 int startMonth=9;
		 int startYear=2018;
		 String title="Day 404";
		 String description="Day not found";
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		GregorianCalendar currentDay = new GregorianCalendar(startYear,startYear,startYear);
		CalDay calendarDay = new CalDay(currentDay);
		calendarDay.addAppt(appt);
		

		assertFalse(calendarDay.isValid());
	 }
	 
	 
	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=1;
		 int startMinute=00;
		 int startDay=1;
		 int startMonth=8;
		 int startYear=2018;
		 String title="The meeting";
		 String description="";
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		GregorianCalendar currentDay = new GregorianCalendar(startYear,startMonth,startDay);
		CalDay calendarDay = new CalDay(currentDay);
		calendarDay.addAppt(appt);
		
		String firstLine = "\t --- " + currentDay + " --- \n";
		String secondLine = " --- -------- Appointments ------------ --- \n";
		String thrid = "\t8/1/2018 at 12:00 ,The meeting, discussing meeting stuff\n";
		String forth = " \n";
		

		assertNotEquals(firstLine + secondLine + thrid + forth, calendarDay.toString());
//add more unit tests as you needed
	}
	@Test
	  public void test04()  throws Throwable  {
		 int startHour=12;
		 int startMinute=00;
		 int startDay=1;
		 int startMonth=8;
		 int startYear=2018;
		 String title="The meeting";
		 String description="discussing meeting stuff";
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		//calday.addAppt(appt);
		GregorianCalendar currentDay = new GregorianCalendar(startYear,startMonth,startDay);
		CalDay calendarDay = new CalDay();
		assertFalse(calendarDay.isValid());
		
		
//add more unit tests as you needed
	}
	
	 @Test
	  public void test05()  throws Throwable  {
		
		 int startHour=26;
		 int startMinute=-1;
		 int startDay=1;
		 int startMonth=14;
		 int startYear=2018;
		 String title="New Year!";
		 String description="Beginning of 2018.";
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		
		GregorianCalendar currentDay = new GregorianCalendar(startYear,startMonth,startDay);
		CalDay calendarDay = new CalDay(currentDay);
		calendarDay.addAppt(appt);
		CalendarUtil test = new CalendarUtil();
		

		assertTrue(calendarDay.isValid());
	}
	
	@Test
	  public void test06()  throws Throwable  {
		
		 int startHour=-1;
		 int startMinute=61;
		 int startDay=60;
		 int startMonth=1;
		 int startYear=2018;
		 String title="New Year!";
		 String description="Beginning of 2018.";
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		
		GregorianCalendar currentDay = new GregorianCalendar(startYear,startMonth,startDay);
		CalDay calendarDay = new CalDay(currentDay);
		calendarDay.addAppt(appt);
		CalendarUtil test = new CalendarUtil();
		
		assertFalse(test.IsLeapYear(2017));
		assertEquals(29, test.NumDaysInMonth(2000, 2));
		assertEquals(30, test.NumDaysInMonth(2000, 3));
		assertTrue(test.IsLeapYear(2000));
		assertTrue(calendarDay.isValid());
	}


}