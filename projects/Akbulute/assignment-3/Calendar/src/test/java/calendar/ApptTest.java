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

	/* @Test
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
	

	 }*/
	 
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
		 //assertEquals("\t1/3/2017 at 10:00pm ,bed time, time to go to sleep\n", appt.toString());	
	

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
	 
public void test05()  throws Throwable  {
		 int startHour=25;
		 int startMinute=61;
		 int startDay=35;
		 int startMonth=14;
		 int startYear=2017;
		 String title="bed time";
		 String description="time to go sleep";
		 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
	       	         description);
					 
		assertEquals(false, appt.getValid());
	
	
	}
	
	public void test06()  throws Throwable  {
		 int startHour=-1;
		 int startMinute=-1;
		 int startDay=0;
		 int startMonth=0;
		 int startYear=2017;
		 String title="bed time";
		 String description="time to go sleep";
		 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
	       	         description);
					 
		assertEquals(false, appt.getValid());
	
	
	}
	
	public void test07()  throws Throwable  {
		 int startHour=25;
		 int startMinute=00;
		 int startDay=50;
		 int startMonth=0;
		 int startYear=2017;
		 String title="bed time";
		 String description="time to go sleep";
		 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
	       	         description);
					 
		appt.setStartHour(25);
		int[] recurringDays = new int[0];
		appt.setRecurrence(recurringDays, 2, 2, 2);
		appt.getRecurIncrement();
		appt.getRecurBy();
		appt.getRecurDays();
	
		assertEquals(false, appt.getValid());
	
	
	}
@Test
	public void test08() throws Throwable {
		Appt appt = new Appt(0,0,0,0,0, null, null);

		appt.setStartHour(15);
		appt.setStartMinute(15);
		appt.setStartDay(20);
		appt.setStartMonth(2);
		appt.setStartYear(2020);
		appt.setTitle("Kayne 2020");
		appt.setDescription("none");

		assertTrue(appt.getValid());
	}
	
@Test
	public void test09() throws Throwable {
		Appt appt = new Appt(0,0,0,0,0, null, null);

		appt.setStartHour(30);
		appt.setStartMinute(61);
		appt.setStartDay(50);
		appt.setStartMonth(1);
		appt.setStartYear(2020);
		appt.setTitle("Kayne 2020");
		appt.setDescription("none");

		assertFalse(appt.getValid());
	}
	

	  @Test
	  public void test10()  throws Throwable  {
		 int startHour=16;
		 int startMinute=45;
		 int startDay=16;
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


		 appt.setStartDay(55);

		 assertFalse(appt.getValid());
		 assertEquals(16, appt.getStartHour());
		 assertEquals(45, appt.getStartMinute());
		 assertEquals(55, appt.getStartDay());
		 assertEquals(5, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }
	 
	

	 
	  @Test
	  public void test11()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=4;
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
	

		 appt.setStartHour(45);

		 assertFalse(appt.getValid());
		 assertEquals(45, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }
	 

	 
	  @Test
	  public void test12()  throws Throwable  {
	   int startHour=20;
	   int startMinute=35;
	   int startDay=29;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Kayne 2020";
	   String description="You know it";
	   
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);

	   assertEquals(20, appt.getStartHour());
	   assertEquals(35, appt.getStartMinute());
	   assertEquals(29, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Kayne 2020", appt.getTitle());
	   assertEquals("You know it", appt.getDescription());
	   assertTrue(appt.getValid());
	 }
	 
	  @Test
	  public void test13()  throws Throwable  {
	   int startHour=20;
	   int startMinute=0;
	   int startDay=25;
	   int startMonth=4;
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

	   assertEquals(20, appt.getStartHour());
	   assertEquals(0, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertTrue(appt.getValid());

	 }
	 
	 @Test
	  public void test14()  throws Throwable  {//big helped!!!!!!
	   int startHour=24;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
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
	 

	   assertEquals(24, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertTrue(appt.getValid());


	 }
	 

 @Test
	  public void test15()  throws Throwable  {
	   int startHour=23;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
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
	
	 
	   assertEquals(23, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertTrue(appt.getValid());
	   

	 }
	 
	 
	  @Test
	  public void test16()  throws Throwable  {
	   int startHour=0;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
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
	
	
	   assertEquals(0, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertTrue(appt.getValid());
	  

	 }
	 
	 

}
