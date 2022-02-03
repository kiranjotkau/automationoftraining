package Regression;

import org.testng.annotations.Test;

import Com.pages.AmazonHomepage;
import Com.pages.signin;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Orders {
	public static WebDriver driver;
	
  @Test(priority=1)
  public void f() throws InterruptedException, IOException {
	  
	  AmazonHomepage ob= new AmazonHomepage(driver);
	  ob.signinhover();
	  shots("sigin");       //shots
	  Thread.sleep(5000);
	  ob.clickonOrders();
	  shots("orders");      //shots
  }
   
  @Test(priority=2)
  public void B() throws InterruptedException, IOException {
signin ob= new signin (driver);
  ob.emailfield();
  Thread.sleep(5000);
  ob.click();
  
  
  }
 
	  
  
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("Webdriver.chrome.driver","C:\\Users\\17035\\eclipse-workspace\\softwaretestingproject2\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https:www.amazon.com");
		driver.manage().window().maximize();
			
	  Thread.sleep(5000);
	  System.out.println("This is before test");}
  

	  
  

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
	  
  }
  public void shots(String ssname) throws IOException {                //WITH  STRING ARGUMENTS SCREENSHOTS
	  File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy( screenshotFile,new File("C:\\Users\\17035\\eclipse-workspace\\PracticeExercise\\drivers\\screenshots\\"+ssname+"pngg"));
	  		
  }
}
