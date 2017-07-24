package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test

	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=14;
		 int startMinute=00;
		 int startDay=6;
		 int startMonth=14;
		 int startYear=2017;
		 String title="Lecture time";
		 String description="";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
	       	         description);
	// assertions
	// String day= this.getStartMonth()+"/"+this.getStartDay()+"/"+this.getStartYear() + " at ";
    // return "\t"+ day +  this.represntationApp()  + " ," +  getTitle()+ ", "+  getDescription()+"\n";
		 assertFalse(appt.getValid());
		 assertEquals(14, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Lecture time", appt.getTitle());
		 assertEquals(null, appt.getDescription());       		
	

	 }
	 
	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=22;
		 int startMinute=00;
		 int startDay=3;
		 int startMonth=1;
		 int startYear=2017;
		 String title="bed time";
		 String description="time to go to sleep";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
	       	         description);
		
	// assertions
	// String day= this.getStartMonth()+"/"+this.getStartDay()+"/"+this.getStartYear() + " at ";
    // return "\t"+ day +  this.represntationApp()  + " ," +  getTitle()+ ", "+  getDescription()+"\n";
		 assertEquals("\t1/3/2017 at 10:00pm ,bed time, time to go to sleep\n", appt.toString());	
	

	 }

@Test
	  public void test04()  throws Throwable  {
		 int startHour=20;
		 int startMinute=00;
		 int startDay=31;
		 int startMonth=0;
		 int startYear=2017;
		 String title="bed time";
		 String description="time to go sleep";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
	       	         description);
	// assertions
	// String day= this.getStartMonth()+"/"+this.getStartDay()+"/"+this.getStartYear() + " at ";
    // return "\t"+ day +  this.represntationApp()  + " ," +  getTitle()+ ", "+  getDescription()+"\n";
	
	assertEquals(false, appt.getValid());


	 }
	 
	
	
}
