package com.project11;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
 
	
	@BeforeTest
	public void InitateDriver()
	{
		System.out.println("Initalize the driver");
	}
	/*@BeforeSuite
	public void Initalizethesuite()
	{
		System.out.println("suite is iniatlized");
	}*/
	//when the person has to login only in 1st testcase and want to logout in the last testcase.then we use beforesuite for login and 
	//for logout aftersuite
	//multiple testcase prerequisite will come in suite
	@Test
	public void Firsttest()
	{
		System.out.println("Initalize the test");
	}
	
	
	//if there is constructor and @test then constructor will work first.as the priority goes to constructor.
	//and if constructor is used then @test is not used
	
	
	/*@BeforeClass
	public void classfunction()
	{
	System.out.println("this is the before class annotation");	
	}
	
	@AfterClass
	public void classfunction1()
	{
	System.out.println("this is the after class annotation");	
	}
	
	@AfterTest
	public void DestroyDriver1()
	{
		System.out.println("this is to destroy driver");
	}
	
	@AfterSuite
	public void Destroythesuite()
	{
		System.out.println("suite is destroyed");
	}*/
}

