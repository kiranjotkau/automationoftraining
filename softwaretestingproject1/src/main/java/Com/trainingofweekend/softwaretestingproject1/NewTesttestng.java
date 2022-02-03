package Com.trainingofweekend.softwaretestingproject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTesttestng {
  @Test(priority=1)
  public void f() throws InterruptedException {//THIS IS ACTUAL TEST ,WILL ALWAYS BETWEEN BEFORE AND AFTER TEST,WE CAN ADD SO MANY CLASS IN ACTUAL TEST
	  System.out.println("This is test1");//IT WILLALWAYS SHOW IN BETWEEN THE BEFORE AND AFTER TEST
	  Thread.sleep(4000);
  }
  @Test(priority=2)                                                 //use priority to execute any test by order
  public void Test2() throws InterruptedException {
	  System.out.println("This is first test");
	  Thread.sleep(4000);
  }
  
  @Test(priority=3)                                             //use priority to execute any test by order
  public void Test3() throws InterruptedException {
	  System.out.println("This is second test");
	  Thread.sleep(4000);
  
  }
  
  @BeforeTest                                                    //use before to open the browser
  public void beforeTest() throws InterruptedException {
	  System.out.println("This is before test");
	  Thread.sleep(4000);
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  System.out.println("This is after class");
	  Thread.sleep(4000);
  }

}
