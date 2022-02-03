package Com.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage {
public static WebDriver driver;
@FindBy(xpath="(//*[@class='nav-line-1 nav-progressive-content'])[2]") WebElement sigin;
@FindBy(xpath="//*[text()='Orders']") WebElement Orders;

public AmazonHomepage  ( WebDriver driver) {
AmazonHomepage.driver=driver;
PageFactory.initElements( driver, this);}



public void signinhover() {
Actions ob= new Actions(driver);
  ob.moveToElement(sigin).build().perform();
  
  
}

public void clickonOrders() {
	 Orders.click();
	
	 
}




	
}



