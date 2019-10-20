package com.project11;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest extends Testbase {

	WebDriver driver;



@BeforeTest
public void driverInitalizer(WebDriver driver)
{
	this.driver=driver;
	
	}

@Test                                                                                                                                                                                                                                                                                    
public void test()
{

System.out.println("this is a normal function");
}

public void display()
{
	System.out.println("this is a normalfunction2");
	}


}
