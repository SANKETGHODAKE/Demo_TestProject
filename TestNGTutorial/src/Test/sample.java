package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class sample 
{
	@Test  //Scenario
	public void TestResult()
	{
		System.out.println("Sanket");
	}
	
	@Test
	public void TestResult2()
	{
		System.out.println("amol");
	}
	
	@Test
	public void TestResult3()
	{
		System.out.println("manas");
	}
	
	@BeforeTest // Precondition
	public void beforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@AfterTest  // Postcondition
	public void AfterTest()
	{
		System.out.println("AfterTest");
		
	}
	
	

}
