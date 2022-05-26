package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class demo6 {
	
	@Test
	public void HomePage()
	{
		System.out.println("Home Page displayed");

	}
	
		
	@Test(dataProvider= "getData")
	public void LoginPage(String Usrname, String Password)
	{
		System.out.println("Login Page displayed");
		System.out.println(Usrname);
		System.out.println(Password);
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
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		// Multidimensional array with 3 rows and 2 column
		Object[][] arr=new Object[3][2];
		
		//3 Username and password are added in getData set to cover the combinations
		
		arr[0][0]="Sruthi";
		arr[0][1]="1234";
		
		arr[1][0]="Swetha";
		arr[1][1]="5678";
		
		arr[2][0]="Siddhu";
		arr[2][1]="4444";
		
		return arr;
	}
}
