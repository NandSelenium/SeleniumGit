package testNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mongodb.MapReduceCommand.OutputType;

public class Failedscreenshot implements ITestListener {
	 @Override		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					

	    	public ChromeDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	    	driver=
	    	File src = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	 File target =new File("D:\\Screenshot");
	    	 FileUtils.copyFile(src, target);	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.println("Parallel Run Success");
	        		
	    }
}
