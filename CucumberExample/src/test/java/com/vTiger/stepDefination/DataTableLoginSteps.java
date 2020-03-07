package com.vTiger.stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableLoginSteps
{
	WebDriver driver;
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.14.0//chromedriver_win32//chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("localhost:100");
	     driver.manage().window().maximize();
		
	}

	@Given("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data = arg1.raw();
		driver.findElement(By.name("user_name")).clear();
		driver.findElement(By.name("user_name")).sendKeys(data.get(0).get(0)); 
		driver.findElement(By.name("user_password")).clear();
		driver.findElement(By.name("user_password")).sendKeys(data.get(0).get(1));
		user_clicks_on_LoginButton();
		driver.findElement(By.name("user_name")).clear();
		driver.findElement(By.name("user_name")).sendKeys(data.get(1).get(0));
		driver.findElement(By.name("user_password")).clear();
		driver.findElement(By.name("user_password")).sendKeys(data.get(1).get(1));
		     //driver.findElement(By.id("login")).click();
		user_clicks_on_LoginButton();
	}

	@Then("^User clicks on LoginButton$")
	public void user_clicks_on_LoginButton() throws Throwable {
		driver.findElement(By.name("Login")).click();
	   
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement(By.linkText("Logout")).click();	 
		
	}

	@Then("^user is back to LoginPage$")
	public void user_is_back_to_LoginPage() throws Throwable {
	    
	System.out.println("Back to LoginPage");
	}

	
}
