package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RunParallel {
    @Test    
    public void executSessionOne(){
            //First session of WebDriver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
            ChromeDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/");
            //find user name text box and fill it
            driver.findElementByName("uid").sendKeys("Driver 1");
            Assert.assertTrue(true);
         driver.close();
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
        ChromeDriver driver = new ChromeDriver();
            //Goto guru99 site
       // driver.get("http://demo.guru99.com/V4/");
        driver.get("https://www.amazon.com/");

        //find user name text box and fill it
       // driver.findElementByName("uid").sendKeys("Driver 2");
        driver.findElementById("twotabsearchtextbox").sendKeys("iphone10");
       driver.close();
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
        ChromeDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElementByName("uid").sendKeys("Driver 2");
     driver.close();
        }        
}
