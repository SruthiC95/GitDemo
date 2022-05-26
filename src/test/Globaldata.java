package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Globaldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prom = new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\Sruthi\\eclipse-workspace\\SeleniumAutomation-Framework\\TestNGTutorial\\src\\test\\data.properties");
		prom.load(fis);
		System.out.println(prom.getProperty("browser"));
		System.out.println(prom.getProperty("url"));
		prom.setProperty("browser", "firefox");
		System.out.println(prom.getProperty("browser"));
		FileOutputStream fos =new FileOutputStream("C:\\Users\\Sruthi\\eclipse-workspace\\SeleniumAutomation-Framework\\TestNGTutorial\\src\\test\\data.properties");
		prom.store(fos, null); 
	}
	
	//create a method 
	//based on browsertype value, driver should get initialize and load the given url
	
	
}
