package com.project11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Testbase {

	protected WebDriver driver ;
	@BeforeTest
	public void InitateDriver()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namrata\\Desktop\\Misc Items\\Training\\SeleniumJavaTrainingProject\\project11\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	                                                  //ctrl+shift+o import required dependency automatically
	                                            	// WebDriver is a interface and ChromeDriver is a class
	
	
	}

}
