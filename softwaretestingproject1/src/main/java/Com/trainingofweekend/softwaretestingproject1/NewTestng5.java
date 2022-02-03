	package Com.trainingofweekend.softwaretestingproject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestng5 {//
  @Test
  public void test1() {
	 System.out.println(" this is test 1"); 
  }
  @Test
  public void test2() {
	 System.out.println(" this is test 2"); 
  }
  @Test
  public void test3() {
	 System.out.println(" this is test 3"); 
  }
  @BeforeMethod                                                     //execute each time before and after test
  public void beforeMethod() { 
	System.out.println("This is before method");                  //we can implement sign in  this method
  }

  @AfterMethod
  public void afterMethod() {  
	System.out.println("This is after method");                      //we can implement sign out function and its not mandatory to use
  }

  @BeforeTest                                                             //only execute once 
  
  
  public void beforeTest() {
	  System.out.println("This is before test");
  }

  @AfterTest
  public void afterTest() {  
	System.out.println("This is after test");                                 //only execute once
  }

}
