package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo2 {

	// Before the class will execute before calling other methods of the class
	@BeforeClass
	public void BfClass()
	{
		System.out.println("Execute this before the class");
	}

	// After the class will execute after calling all methods of the class	
	@AfterClass
	public void AfClass()
	{
		System.out.println("Execute this After the class");
	}
	@Parameters({"URL"})
	@Test
	public void test2(String urlname)
	{
		System.out.println("Print Good");
		System.out.println(urlname);
	}
	
	// Class methods will execute based on the alphabetical series
	@Test   
	public void Execute()
	{
		System.out.println("Run the method in alphabetical series");
	}
	
	//Before Test annotation will execute at the Start of the test block in xml
	@BeforeTest
	public void PreRequisite()
	{
		System.out.println("Will execute first");
	}
}
