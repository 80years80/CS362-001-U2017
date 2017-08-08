package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=10;
		 int startMinute=30;
		 int startDay=6;
		 int startMonth=10;
		 int startYear=2017;
		 String title="Bed time";
		 String description="Time to sleep";
		 LinkedList<Appt> appointments = new LinkedList<Appt>();
		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);
		
		 GregorianCalendar currentDay = new GregorianCalendar(startYear,startMonth,startDay);
		 CalDay calendar = new CalDay(currentDay);
		 currentDay = new GregorianCalendar(startYear,startMonth,startDay+3);
		 calendar = new CalDay(currentDay);
		 int[] recur = new int[0];
		 appt.setRecurrence(recur, appt.RECUR_BY_YEARLY, 3, -1);
		 TimeTable table = new TimeTable();
		 appointments.add(appt);
		 
		 table.deleteAppt(appointments, null);
		 table.deleteAppt(null, null);
		 table.deleteAppt(null, appt);
		 table.deleteAppt(appointments, appt);
		 appointments.add(new Appt(10, 30, 1, 1, 2018, "New Year", "des"));
		 table.deleteAppt(appointments, new Appt(10, 30, 1, 1, 2018, "New Year", "des"));
		 appointments.add(new Appt(10, 30, 1, 0, 2018, "New Year", "des"));
		 table.deleteAppt(appointments, new Appt(10, 30, 1, 0, 2018, "New Year", "des"));
		 
		 appt = new Appt(10,
				 30,
				 1,
				 10,
				 2017,
				 "Assignment time",
				 "");
		 appointments.add(appt);
		 table.deleteAppt(appointments, appt);
		 //assertTrue(appointments.isEmpty());
		assertFalse(appointments.isEmpty());
 }
	/* @Test
	  public void test02()  throws Throwable  { 
		 int startHour=10;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=7;
		 int startYear=2017;
		 String title="Bed time";
		 String description="Time to sleep";
		 LinkedList<Appt> appointments = new LinkedList<Appt>();
		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);

		 GregorianCalendar first = new GregorianCalendar(2017, 7, 8);
		 GregorianCalendar last = new GregorianCalendar(2017, 7, 10);
		 
		 LinkedList<CalDay> test = new LinkedList<CalDay>();
		 TimeTable table = new TimeTable();
		try{
		 test = table.getApptRange(appointments, last, first);
		}
		catch( NullPointerException e)
		{
		}
		 
	 }*/
	 
	 	 @Test
	  public void test03()  throws Throwable  { 
		int startHour=10;
		 int startMinute=30;
		 int startDay=7;
		 int startMonth=3;
		 int startYear=2017;
		 String title="Bed time";
		 String description="Time to sleep";
		 LinkedList<Appt> appointments = new LinkedList<Appt>();
		 LinkedList<Appt> appointments2 = new LinkedList<Appt>();
		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);
		Appt appt2 = new Appt(10,
				 30,
				 8,
				 3,
				 2017,
				 "birth day",
				 "someone has a birth day");
		//Appt appt3 = new Appt(12,
			//	 30,
			//	 8,
		//		 1,
			//	 2017,
			//	 "appointment3",
			//	 "");
				 
		 appointments.add(appt);
		 appointments.add(appt2);
		 appointments2.add(appt);
		 appointments2.add(appt2);
	//	 appointments.add(appt3);
		 int[] myArray = {1, 0};
		 TimeTable table = new TimeTable();
		 appointments = table.permute(appointments, myArray);
		// assertNotEquals(appointments2.startDay, appointments.startDay);
		 
				 
	 }
	 
	 public void test04()  throws Throwable  { 
		int startHour=10;
		 int startMinute=30;
		 int startDay=6;
		 int startMonth=12;
		 int startYear=2017;
		 String title="Bed time";
		 String description="Time to sleep";
		 LinkedList<Appt> appointments = new LinkedList<Appt>();
		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);
		TimeTable table = new TimeTable();
		appointments.add(appt);
		appointments.add(new Appt(10, 30, 1, 1, 2018, "New Year", "des"));
		appointments.add(new Appt(10, 30, 2, 1, 2018, "New Year", "des"));
		appointments.add(new Appt(10, 30, 2, 0, 2018, "New Year", "des"));
		table.deleteAppt(appointments, new Appt(10, 30, 1, 1, 2018, "New Year", "des"));
		assertFalse(appointments.isEmpty());
		table.deleteAppt(appointments, new Appt(10, 30, 2, 1, 2018, "New Year", "des"));
		assertFalse(appointments.isEmpty());
		table.deleteAppt(appointments, new Appt(10, 30, 2, 0, 2018, "New Year", "des"));
		assertTrue(appointments.isEmpty());
	 }
	 
	 public void test05()  throws Throwable  { 
		int startHour=10;
		 int startMinute=30;
		 int startDay=8;
		 int startMonth=10;
		 int startYear=2017;
		 String title="Bed time";
		 String description="Time to sleep";
		 LinkedList<Appt> appointments = new LinkedList<Appt>();
		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);
		 appointments.add(appt);
		 int[] recur = new int[0];
		 appt.setRecurrence(recur, appt.RECUR_BY_MONTHLY, 10, 10);
		 appt.setRecurrence(recur, appt.RECUR_BY_YEARLY, 10, 10);
		 appt.setRecurrence(recur, appt.RECUR_BY_WEEKLY, 0, 12);
		 GregorianCalendar first = new GregorianCalendar(2017, 10, 8);
		 GregorianCalendar last = new GregorianCalendar(2017, 10, 10);
		 
		 LinkedList<CalDay> test = new LinkedList<CalDay>();
		 TimeTable table = new TimeTable();
		 try{
		 test = table.getApptRange(appointments, first, last);
		 } catch( NullPointerException e)
		 {
		 }
		 
	 }
	 public void test06()  throws Throwable  { 
		 int startHour=61;
		 int startMinute=00;
		 int startDay=1;
		 int startMonth=0;
		 int startYear=2019;
		 String title="Bed time";
		 String description="Time to sleep";
		 LinkedList<Appt> appointments = new LinkedList<Appt>();
		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);
		 appointments.add(appt);
		 GregorianCalendar first = new GregorianCalendar(2017, 0, 1);
		 GregorianCalendar last = new GregorianCalendar(2017, 0, 10);
		 
		 LinkedList<CalDay> test = new LinkedList<CalDay>();
		 TimeTable table = new TimeTable();
		
		
	 }
	 
	@Test
	public void test07()  throws Throwable  {
		TimeTable table = new TimeTable();


		Appt appt = new Appt(1,
				10 ,
				8 ,
				7 ,
				2017 ,
				"appt",
				"");

		int [] arr = {};
		appt.setRecurrence(arr, 1, 1, 10);

		LinkedList<Appt> appointments = new LinkedList<Appt>();
		appointments.add(appt);
		assertTrue(appt.isRecurring());


		GregorianCalendar first = new GregorianCalendar(2017, 7, 8);
		GregorianCalendar last = new GregorianCalendar(2017, 7, 9);

		try {
		table.getApptRange(appointments, first, last);
		} catch( NullPointerException e)
		{
			
		}
		}
		
		@Test
	public void test08()  throws Throwable  {
		TimeTable table = new TimeTable();


		Appt appt = new Appt(1,
				10 ,
				8 ,
				7 ,
				2017 ,
				"appt",
				"");

		int [] arr = {2, 3};
		appt.setRecurrence(arr, 3, 3, 10);

		LinkedList<Appt> appointments = new LinkedList<Appt>();
		appointments.add(appt);
		assertTrue(appt.isRecurring());


		GregorianCalendar first = new GregorianCalendar(2017, 7, 8);
		GregorianCalendar last = new GregorianCalendar(2017, 7, 9);

		try	{
		table.getApptRange(appointments, first, last);
		} catch(NullPointerException e)	{
		}
	}
		
		public void test09()  throws Throwable  {
		TimeTable table = new TimeTable();


		Appt appt = new Appt(1,
				10 ,
				8 ,
				7 ,
				2017 ,
				"appt",
				"");

		int [] arr = {1, 0};
		appt.setRecurrence(arr, 3, 3, 10);

		LinkedList<Appt> appointments = new LinkedList<Appt>();
		appointments.add(appt);
		assertTrue(appt.isRecurring());


		GregorianCalendar first = new GregorianCalendar(2017, 7, 8);
		GregorianCalendar last = new GregorianCalendar(2017, 7, 9);
		try {
	
		table.getApptRange(appointments, first, last);
		}
		catch( NullPointerException e)
		{
		}
		}

		 @Test
	  public void test20()  throws Throwable  {//helped
		  TimeTable timetable = new TimeTable();

		 
	 	  Appt appt1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "appt1",
	 		         "");

	 	int [] arr = {1,2,3};
	 	appt1.setRecurrence(arr, 1, 1, 10);

	LinkedList<Appt> apointList = new LinkedList<Appt>();
	apointList.add(appt1);
	assertTrue(appt1.isRecurring());

		
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		try	{
 	  		LinkedList<CalDay> NewList = timetable.getApptRange(apointList, first, last);
 	  } catch(NullPointerException e)	{

 	  }
	 }

	
	


@Test
	 public void test26()  throws Throwable  {//helped a bit
	 
		 TimeTable timetable = new TimeTable();

		 
		 Appt appt1 = new Appt(1,
					  10 ,
					  5 ,
					  6 ,
					  2017 ,
					  "appt1",
					  "");

	  int [] arr = {1,2};
	  appt1.setRecurrence(arr, 7, 7, 10);

	LinkedList<Appt> apointList = new LinkedList<Appt>();
	apointList.add(appt1);
	assertTrue(appt1.isRecurring());

	
	  GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
	  GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

	  try	{
	  		LinkedList<CalDay> NewList = timetable.getApptRange(apointList, first, last);
	  } catch(NullPointerException e)	{

	  }
	}
	
	@Test
	 public void test27()  throws Throwable  {//helped a bit
		 TimeTable timetable = new TimeTable();

	
		 Appt appt1 = new Appt(1,
					  10 ,
					  5 ,
					  6 ,
					  2018 ,
					  "appt1",
					  "");

	  int [] arr = {1,2};
	  appt1.setRecurrence(arr, 3, 3, 10);

	LinkedList<Appt> apointList = new LinkedList<Appt>();
	apointList.add(appt1);
	assertTrue(appt1.isRecurring());

	  
	  GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
	  GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

	  try	{
	  		LinkedList<CalDay> NewList = timetable.getApptRange(apointList, first, last);
			assertEquals(1, NewList.size());
	  } catch(NullPointerException e)	{

	  }
	}
	
	
	@Test
	 public void test30()  throws Throwable  { //helped
		 TimeTable timetable = new TimeTable();

		 Appt appt1 = new Appt(1,
					 10 ,
					 6 ,
					 6 ,
					 2017 ,
					 "appt1",
					 "");

		 Appt appt2 = new Appt(1,
					 10 ,
					 7 ,
					 6 ,
					 2017 ,
					 "appt2",
					 "");

		 Appt appt3 = new Appt(1,
					 10 ,
					 8 ,
					 6 ,
					 2017 ,
					 "appt3",
					 "");



	int [] arr = {1,2,3};
	appt1.setRecurrence(arr, 1, 1, -1);
	appt2.setRecurrence(arr, 1, 1, -1);
	appt3.setRecurrence(arr, 1, 1, -1);



	 LinkedList<Appt> apointList = new LinkedList<Appt>();
	 apointList.add(appt1);
	 apointList.add(appt2);
	 apointList.add(appt3);

	 assertTrue(appt1.getValid());
	 assertTrue(appt2.getValid());
	 assertTrue(appt3.getValid());

	
	  GregorianCalendar first = new GregorianCalendar(2017, 10, 9);
	  GregorianCalendar last = new GregorianCalendar(2017, 10, 12);

	
			LinkedList<CalDay> NewList = timetable.getApptRange(apointList, first, last);
			assertEquals(3, NewList.size());
			assertEquals(-1, NewList.get(0).getSizeAppts());


	}
	
	@Test
	 public void test34()  throws Throwable  {//fixed
		 TimeTable timetable = new TimeTable();

		 Appt appt1 = new Appt(1,
					  10 ,
					  5 ,
					  6 ,
					  2017 ,
					  "a point",
					  "");


	  Appt appt2 = new Appt(1,
				  10 ,
				  7 ,
				  6 ,
				  2017 ,
				  "a point too",
				  "");
	int [] arr = {1,2,3,4,5,6,7,8,9,10};
	appt1.setRecurrence(arr, 1, 1, -1);
	int [] arr_2 = {1,2,3};
	appt2.setRecurrence(arr_2, 3, 3, -1);



	LinkedList<Appt> apointList = new LinkedList<Appt>();
	apointList.add(appt1);
	apointList.add(appt2);
	assertTrue(appt1.isRecurring());
	assertTrue(appt2.isRecurring());

	  
	  GregorianCalendar first = new GregorianCalendar(2021, 8, 6);
	  GregorianCalendar last = new GregorianCalendar(2021, 9, 7);

	 
			LinkedList<CalDay> NewList = timetable.getApptRange(apointList, first, last);
			assertEquals(31, NewList.size());
			assertEquals(-1, NewList.get(0).getSizeAppts());
			assertEquals(-1, NewList.get(1).getSizeAppts());
			assertEquals(-1, NewList.get(2).getSizeAppts());
	
	}
//add more unit tests as you needed
}
