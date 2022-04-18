package Com.Assesrt.Tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.generic.BaseClass;
import com.generic.IAutoConstant;
import com.google.common.io.Files;




public class Listerners_Execution extends BaseClass implements ITestListener 
{


	public void onTestStart(ITestResult result) {
		
	}

	
	public void onTestSuccess(ITestResult result) {
		
	}


	public void onTestFailure(ITestResult result) {
		TakesScreenshot sh=(TakesScreenshot)sdriver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dest=new File(IAutoConstant.screenshotspath+result.getMethod().getMethodName()+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void onTestSkipped(ITestResult result) {
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	public void onStart(ITestContext context) {
		
	}

	
	public void onFinish(ITestContext context) {
		
	}
	

}
