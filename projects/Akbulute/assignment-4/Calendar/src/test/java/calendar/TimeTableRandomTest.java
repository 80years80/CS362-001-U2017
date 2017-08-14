package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	
	@Test
	  public void radnomtestDeleteAppt()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 int count = 0;
		 
		 System.out.println("Start testing...");
		 
		//try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				TimeTable table = new TimeTable();
				GregorianCalendar Cal = new GregorianCalendar();
				CalDay theDay = new CalDay(Cal);
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);;
				 int startMonth=ValuesGenerator.RandInt(random);;
				 int startYear=ValuesGenerator.RandInt(random);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data	 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				 Appt appt2 = new Appt(startHour,
				          startMinute,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
			 if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
				appt.setStartMinute(random.nextInt(100)-20);
				appt.setStartHour(random.nextInt(100)-20);
				appt.setStartDay(random.nextInt(100));
				appt.setStartMonth(random.nextInt(100));
				
				appt2.setStartMinute(random.nextInt(100)-20);
				appt2.setStartHour(random.nextInt(100)-20);
				appt2.setStartDay(random.nextInt(100));
				appt2.setStartMonth(random.nextInt(100));
				
				theDay.addAppt(appt);
				theDay.addAppt(appt2);
				table.deleteAppt(theDay.appts, null);
				table.deleteAppt(theDay.appts, appt);
				table.deleteAppt(null, null);
				table.deleteAppt(null, appt2);
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		//}catch(NullPointerException e){
			
		//}
	 
		 System.out.println("Done testing...");
	 }

	 @Test
	  public void radnomtestGetApptRange()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 int count = 0;
		 
		 System.out.println("Start testing...");
		 
		//try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				TimeTable table = new TimeTable();
				GregorianCalendar Cal = new GregorianCalendar();
				CalDay theDay = new CalDay(Cal);
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);;
				 int startMonth=ValuesGenerator.RandInt(random);;
				 int startYear=ValuesGenerator.RandInt(random);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data	 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          7 ,
				          7 ,
				          2017 ,
				          title,
				         description);
				 Appt appt2 = new Appt(startHour,
				          startMinute,
							9,
							7 ,
				          2017 ,
				          title,
				         description);
			 if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
				appt.setStartMinute(random.nextInt(100)-20);
				appt.setStartHour(random.nextInt(100)-20);
				//appt.setStartDay(random.nextInt(100));
				//appt.setStartMonth(random.nextInt(100));
				
				
				appt2.setStartMinute(random.nextInt(100)-20);
				appt2.setStartHour(random.nextInt(100)-20);
				//appt2.setStartDay(random.nextInt(100));
				//appt2.setStartMonth(random.nextInt(100));
				
				theDay.addAppt(appt);
				theDay.addAppt(appt2);
				GregorianCalendar first = new GregorianCalendar(2017, 7, 7);
				GregorianCalendar last = new GregorianCalendar(2017, 7, 9);
				table.getApptRange(theDay.appts, first, last);
				
				}
				
				
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			
			}
		
	 
		 System.out.println("Done testing...");
	 }

	
}
