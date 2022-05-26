package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class demo3 {
	
	//Suite will execute before the suite Start
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Execute before suite");
	}
	
	// Before method will execute before every method of class
	@BeforeMethod
	public void BfMethod()
	{
		System.out.println("Execute before method");
	}
	
	// After method will execute after every method of class
	@AfterMethod
	public void AfMethod()
	{
		System.out.println("Execute After method");
	}
	
	@Test(groups= {"Smoke"})
	public void HomePage()
	{
		System.out.println("Home Page displayed");
	}
	
	
	@Test
	public void LoginPage()
	{
		System.out.println("Login Page displayed");
	}
	
	@Test
	public void MasterPage()
	{
		System.out.println("Master Page displayed");
	}
	
	@Test
	public void MasterPage2()
	{
		System.out.println("Master Page2 displayed");
	}
}
