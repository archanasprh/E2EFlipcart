package com.vTiger.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineWithExampleSteps 
{
	WebDriver driver;
	@Given("^user should be landing on login page$")
	public void user_should_be_landing_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.14.0//chromedriver_win32//chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("localhost:100");
	     driver.manage().window().maximize();
	    
	}

	@When("^user enters valid credential \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_credential_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.name("user_name")).sendKeys(arg1);
	    driver.findElement(By.name("user_password")).sendKeys(arg2);
		driver.findElement(By.name("Login")).click();
	}
	
	@Then("^user should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
	    System.out.println("Login success");
	}
	
	@Then("^page should be navigate on login page$")
	public void page_should_be_navigate_on_login_page() throws Throwable {

		System.out.println("page should be navigate on Login page");
	}
	
	}
