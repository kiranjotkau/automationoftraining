package Com.trainingofweekend.softwaretestingproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static WebDriver driver;
	
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Hello World!");
    
    
    System.setProperty("webdriver.chrome.driver","C:\\Users\\17035\\eclipse-workspace\\softwaretestingproject1\\drivers\\chromedriver.exe");
    
    
    driver=new ChromeDriver();
    driver.get("https:www.facebook.com"); //open the facebook page
    WebElement emailfield= driver.findElement(By.id("email"));
    emailfield.sendKeys("abc@yahoo.com");
    
    WebElement passwordfield= driver.findElement(By.id("pass"));
    passwordfield.sendKeys("123456");
    
   WebElement loginbutton= driver.findElement(By.name("login"));
    loginbutton.click();
    
    Thread.sleep(15000);
    
    driver.close();
    
  }
  
}
