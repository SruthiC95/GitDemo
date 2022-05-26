package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface used to listen the test and implement the testng listeners
public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	@Override 
	public void onTestSuccess(ITestResult result) {

		System.out.println("Test result is executed successfully");
		
	  }

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test result is failed" +result.getName());
	  }

	@Override
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	@Override
	public void onStart(ITestContext context) {
	    // not implemented
	  }

	@Override
	public void onFinish(ITestContext context) {
	    // not implemented
	  }
	
}
