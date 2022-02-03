package Com.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin {

	public static WebDriver driver;
	
	@FindBy (xpath="//*[@type='email']") WebElement signin;
	@FindBy(xpath="(//*[@id='continue'])[2]") WebElement signinclick;

	public signin(WebDriver driver) {
		//signin.driver=driver; 
		
		PageFactory.initElements( driver, this);}
	
	public void emailfield() throws IOException {
		signin.sendKeys("chahal23@gmail.com");
		shots();
	}
	public void click() throws IOException {
		signinclick.click();
		shots();
		
		
		
	}
	 public void shots() throws IOException {
		  File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy( screenshotFile,new File("C:\\Users\\17035\\eclipse-workspace\\PracticeExercise\\drivers\\screenshots\\2.png"));
		  }
	
	}

