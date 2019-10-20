package com.project11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Spicejet {
@Test
public void Initiatedriver()	
{
 	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namrata\\Desktop\\Misc Items\\Training\\SeleniumJavaTrainingProject\\project11\\src\\test\\java\\com\\project11\\Spicejet.java");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.id("//div[@id='divpaxinfo']"));
	driver.findElement(By.id("//span[@id='hrefIncAdt']"));
	driver.findElement(By.id("//input[@id='btnclosepaxoption']"));
	}
}
