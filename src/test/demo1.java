package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class demo1 {

// All testNG test cases should be run in a method
	
	@Test   // Method after the test annotation	is treated as TestNG
	public void Run()
	{
		System.out.println("Print Hello");
		System.out.println("GIT Demo Run");
		System.out.println("Merge branches");
	}

	
	@Test   // Second test case with @test annotation
	public void Second()
	{
		System.out.println("Second Test case");
		System.out.println("Development Update");
	}
	
	// After Test annotation will execute at the end of the test block in xml 
	@AfterTest
	public void Exit()
	{
		System.out.println("will execute at end");
	}
	
	
	@Test(groups= {"Smoke"})  
	public void Run2()
	{
		System.out.println("Print Bye");
	}
	// Suite will execute after the suite run complete
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Execute After suite");
	}
}
