package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {

	static String url;
	Properties prop;
	FileInputStream fis;
	static String browserType;
	static String env;
	
	
	public GlobalValues() throws FileNotFoundException {
		prop = new Properties();
		fis =new FileInputStream("C:\\Users\\Sruthi\\eclipse-workspace\\SeleniumAutomation-Framework\\TestNGTutorial\\src\\test\\data.properties");
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		GlobalValues gv=new GlobalValues();
		browserType=gv.dataCheck("browser");
		System.out.println(browserType);
		url=gv.dataCheck("url");
		System.out.println(url);
		env=gv.dataCheck("environment");
		System.out.println(env);
		
	/*	System.out.println(prom.getProperty("browser"));
		System.out.println(prom.getProperty("url"));
		prom.setProperty("browser", "firefox");
		System.out.println(prom.getProperty("browser"));
		FileOutputStream fos =new FileOutputStream("C:\\Users\\Sruthi\\eclipse-workspace\\SeleniumAutomation-Framework\\TestNGTutorial\\src\\test\\data.properties");
		prom.store(fos, null); */
	}

	public String dataCheck(String name) throws IOException
	{		
		prop.load(fis);
		String st=prop.getProperty(name);
		return st;
		
	}
	
	
	
	//create a method 
	//based on browsertype value, driver should get initialize and load the given url
	
	
}
