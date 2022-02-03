package Com.pages;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {
public static WebDriver driver;
@FindBy(xpath="(//*[@class='nav-line-1 nav-progressive-content'])[2]") WebElement signin;
@FindBy(xpath="//*[text()='Prime Membership']") WebElement amazonprime;

public  AmazonHome(WebDriver driver) {
	AmazonHome.driver=driver;
	PageFactory.initElements( driver, this);//this is constructor
	
}
	public void signinhover() {
		Actions ob=new Actions(driver);
		ob.moveToElement(signin).build().perform();
	}
	public void clickonamazonprime() {
		amazonprime.click();
		
	}
		
	}

