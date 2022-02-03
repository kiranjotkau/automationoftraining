package Com.trainingofweekend.softwaretestingproject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
 

@Test
  public void f() throws InterruptedException {
	  System.out.println("This is test2");
	  Thread.sleep(5000);
	  
  }
  public static WebDriver driver;
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.out.println("This is before test 2");
	  System.setProperty("Webdriver.chrome.driver","C:\\Users\\17035\\eclipse-workspace\\softwaretestingproject2\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https:www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
  }
  
  @Test(priority=1)
  public void test1() throws InterruptedException {
	  System.out.println("This is test 1");
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox22")); // when we enter wrong element it skip to next
	searchbox.sendKeys("Handsoap");
	 Thread.sleep(5000);
  }
  
  @Test (priority=2, dependsOnMethods= { "test1" })  //test2 depend on test 1 (we use dependsonMethods=test1)
  public void test2() throws InterruptedException {
	  System.out.println("This is test 2");
	
	 Thread.sleep(5000);
  }
	 

  @AfterTest
  public void afterTest() throws InterruptedException {
	  System.out.println("This is after test 2");
	 Thread.sleep(5000);
	  driver.close();
	  
  }
  

}
