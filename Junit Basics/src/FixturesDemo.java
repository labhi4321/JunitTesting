import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.*;


public class FixturesDemo  {
	
	@BeforeClass
	public static void setUp() {
		
		System.out.println("Open browser ");
	}
	
	@Before
	public void Testbeforemethod() {
		
		System.out.println("enter the User Details ");
		
		
	}
	
		
	@AfterClass
	public static void tearDown() {
		System.out.println("Close browser");
		
	}
		
		@After
		public void Testaftermethod() {
			
			System.out.println("Click Submit Button");
		
		
	
		
		
	}
	
	@Test
	public void ActualTest() {
		
		System.out.println("This is the test and User is successfuly logged in ");
		//System.out.println("No of Test Case = "+ this.countTestCases());
		
	      //test getName 
	      //String name = this.getName();
	      //System.out.println("Test Case Name = "+ name);

	}

}
