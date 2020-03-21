package testNG;

		import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
		public class Crossbrowser {
			
			public ChromeDriver driver;
			public WebDriver driver1;
			public InternetExplorerDriver driver2;  

			@BeforeMethod
			
			public void open()
			{
				System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
				System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");

			
			}
						
			
		    @Test    
		    public void write(){
driver=new ChromeDriver();
driver1=new FirefoxDriver();
driver2=new InternetExplorerDriver();  


		            driver.get("http://www.esky.com");
		            driver1.get("https://www.esky.com");
		            driver2.get("https://www.esky.com");
		            //find user name text box and fill it
		        	System.out.println("esky website launched successfully");
		         driver.close();
		        }
		        
		   	}

