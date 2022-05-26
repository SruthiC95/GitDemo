package test;

import org.testng.annotations.Test;


public class demo4 {
	
	// groups is used to separate the test cases and run it for smoke or sanity
	@Test(groups= {"Smoke"})
	public void HomePage()
	{
		System.out.println("Home Page displayed");
	}
	
	// dependsOnMethods will change the alphabetical order execution 
	//of the methods in class as each test depends on different method	
	@Test(dependsOnMethods= {"MasterPage2"})
	public void LoginPage()
	{
		System.out.println("Login Page displayed");
	}
	
	// Enabled will make the method as not run if false
	@Test(enabled= false)
	public void MasterPage()
	{
		System.out.println("Master Page displayed");
	}
	
	//timeout will make the method wait for complete run explicitly
	@Test(timeOut= 4000)
	public void MasterPage2()
	{
		System.out.println("Master Page2 displayed");
	}
}
