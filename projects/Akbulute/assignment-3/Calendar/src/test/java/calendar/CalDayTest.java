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
		CalDay calDay = new CalDay(currentDay);
		calDay.addAppt(appt);
		

		assertTrue(calDay.isValid());
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
		CalDay calDay = new CalDay(currentDay);
		calDay.addAppt(appt);
		

		assertTrue(calDay.isValid());
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
		CalDay calDay = new CalDay(currentDay);
		calDay.addAppt(appt);
		
		String firstLine = "\t --- " + currentDay + " --- \n";
		String secondLine = " --- -------- Appointments ------------ --- \n";
		String thrid = "\t8/1/2018 at 12:00 ,The meeting, discussing meeting stuff\n";
		String forth = " \n";
		

		assertNotEquals(firstLine + secondLine + thrid + forth, calDay.toString());
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
		//CalDay.addAppt(appt);
		GregorianCalendar currentDay = new GregorianCalendar(startYear,startMonth,startDay);
		CalDay calDay = new CalDay();
		assertFalse(calDay.isValid());
		
		
//add more unit tests as you needed
	}
	
	/* @Test
	  public void test05()  throws Throwable  {
		
		 int startHour=26;
		 int startMinute=1;
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
		CalDay CalDay = new CalDay(currentDay);
		CalDay.addAppt(appt);
		CalendarUtil test = new CalendarUtil();
		

		assertTrue(CalDay.isValid());
	}*/
	
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
		CalDay calDay = new CalDay(currentDay);
		calDay.addAppt(appt);
		CalendarUtil test = new CalendarUtil();
		
		assertFalse(test.IsLeapYear(2017));
		assertEquals(31, test.NumDaysInMonth(2000, 2));
		assertEquals(30, test.NumDaysInMonth(2000, 3));
		assertTrue(test.IsLeapYear(2000));
		assertTrue(calDay.isValid());
	}
	
	  @Test
	  public void test07()  throws Throwable  {
		  GregorianCalendar today = new GregorianCalendar(2017, 2, 10);
		  CalDay calDay = new CalDay(today);

		 int startHour=13;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
	
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 calDay.addAppt(appt);

		 assertTrue(calDay.isValid());
		 assertEquals(2017, calDay.getYear());
		 assertEquals(2, calDay.getMonth());

	 }
	 
	  @Test
	  public void test08()  throws Throwable  {
		 GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
		 CalDay calDay = new CalDay(today);

		 int startHour=12;
		 int startMinute=45;
		 int startDay=6;
		 int startMonth=5;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 Appt appt2 = new Appt(5,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 Appt appt3 = new Appt(5,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 calDay.addAppt(appt1);
		 calDay.addAppt(appt2);
		 calDay.addAppt(appt3);

		 assertTrue(calDay.isValid());
		 assertEquals(2017, calDay.getYear());
		 assertEquals(1, calDay.getMonth());

	 }

	 @Test
	  public void test09()  throws Throwable  {
		 GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
		 CalDay calDay = new CalDay(today);

		 int startHour=25;
		 int startMinute=45;
		 int startDay=5;
		 int startMonth=5;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 calDay.appts = null;
		 calDay.addAppt(appt);

		 assertTrue(calDay.isValid());
		 assertEquals(2017, calDay.getYear());
		 assertEquals(1, calDay.getMonth());
	 }


	 
 @Test
	  public void test11()  throws Throwable  {
		 GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
		  CalDay calDay = new CalDay(today);

		 int startHour=13;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt1 = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);

		 Appt appt2 = new Appt(5,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);

		 Appt appt3 = new Appt(5,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);

		 calDay.addAppt(appt1);
		 calDay.addAppt(appt2);
		 calDay.addAppt(appt3);

		 assertTrue(calDay.isValid());
		 assertEquals(2017, calDay.getYear());
		 assertEquals(1, calDay.getMonth());

	 }
	 


}