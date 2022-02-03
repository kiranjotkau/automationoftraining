package Com.trainingofweekend.softwaretestingproject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class NewTest4 {
	public static WebDriver driver;
  @BeforeTest
  public void f() throws InterruptedException {
	  System.out.println("This is before test");
	  
		 
	  System.setProperty("Webdriver.chrome.driver","C:\\Users\\17035\\eclipse-workspace\\softwaretestingproject2\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https:www.amazon.com");
		driver.manage().window().maximize();
			
	  Thread.sleep(5000);}
  
  @Test(priority=1)
  public void Test1() throws InterruptedException {
	 System.out.println("This is test 1");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("baby shoes");
		 Thread.sleep(5000);
  }
  
 @Test(priority=2)
  public void Test2() {
	 System.out.println("This is test 2");
	 WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
	 searchbutton.click();
  }
 
   @AfterTest
  public void afterTest() {
	  System.out.println("This is  after test");
	  driver.close();
	  
  }

}
