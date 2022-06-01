package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class demo5 {
	
	// Parameter annotation is used to call the value as common by using the centralized xml page
	// Multiple values can also be passed
	@Parameters({"URL","Key/Username"})
	@Test
	public void HomePage(String urlname, String key)
	{
		System.out.println("Home Page displayed");
		System.out.println(urlname);
		System.out.println(key);
	}
	
		
	@Test
	public void LoginPage()
	{
		System.out.println("Login Page displayed");
		System.out.println("Updated git");
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
